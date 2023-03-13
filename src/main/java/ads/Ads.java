package ads;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
//    this is the DAO interface that describes the operation that our app can perform with ads
//    if you implement ads you have to use this method
    List<Ad> all();

    Long insert(Ad ad);
}
