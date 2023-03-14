package books;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLBooksDao implements Books{
    private Connection connection= null;

    public MySQLBooksDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e){
            throw new RuntimeException("error connecting to database", e);
        }
    }
    @Override
    public List<Book> all(){
        List<Book> books = new ArrayList<>();
        try{
            String sql = "SELECT * FROM books_example.books";
            PreparedStatement stmt = connection.prepareStatement(sql);
//            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                books.add(new Book(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("author")
                ));
            }
            return books;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public long insert(Book book){
        String sql = "INSERT INTO books_example.books (title,author) VALUES (?,?);";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, book.getTitle());
            stmt.setString(2,book.getAuthor());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
