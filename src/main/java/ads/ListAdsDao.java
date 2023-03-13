package ads;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads{
//    this class implements the methods defined in the Ads interface
    private List<Ad> ads;
    @Override
    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }



    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                "Playstation for sale",
                "This is a slightly used playstation",
                1
        ));
        ads.add(new Ad(
                2,
                "Super Nintendo",
                "Get your game on with this old-school classic!",
                1
        ));
        ads.add(new Ad(
                3,
                "Junior Java Developer Position",
                "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript",
                2
        ));
        ads.add(new Ad(
                4,
                "JavaScript Developer needed",
                "Must have strong Java skills",
                2
        ));
        ads.add(new Ad(
                4,
                "X-Box for sale",
                "A slightly used x-box",
                1
        ));
        return ads;
    }
}
