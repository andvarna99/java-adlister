package com.codeup.adlister.dao;

import books.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static void main(String[] args) {
        //test users dao
        Users dao = DaoFactory.getUsersDao();
        System.out.println(dao.findByUsername("andrea").getUsername());
    }
}
