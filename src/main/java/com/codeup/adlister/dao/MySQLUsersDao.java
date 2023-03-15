package com.codeup.adlister.dao;


import books.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;


public class MySQLUsersDao implements Users {

    private Connection connection = null;


    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        //we need prepare statements since we are using user input
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
            pstmt.setString(1,username);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            //keeps this function cleaner
            User user = extractUser(rs);
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving a user: " + username, e);
        }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement pstmt = null;
            String myQuery = "INSERT INTO users (username,email,password) VALUES (?,?,?)";
            pstmt = connection.prepareStatement(myQuery,  Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1,user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());

            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }
}
