package ads;

import books.Books;
import books.Config;
import books.MySQLBooksDao;

public class DaoFactory {
    private static Ads adsDao;
    private static Books booksDao;

    public static Ads getAdsDao(){
        if(adsDao == null){
            Config config = new Config();
            adsDao = new MySQLadsDao(config);
        }
        return adsDao;
    }
    public static Books getBooksDao(){
        if(booksDao == null){
            Config config = new Config();
            booksDao = new MySQLBooksDao(config);
        }
        return booksDao;
    }
}
