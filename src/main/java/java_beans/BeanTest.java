package java_beans;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album(33,"Hiatus Kaiyote","Choose Your Weapon",2015, 2.000000,"Neo Soul, Alternative, R&B");
        Author author = new Author(1,"Douglas","Adams");
        Quote quote1 = new Quote(5,"Don't Panic.",author);
        Quote quote2 = new Quote(1,"I love deadlines. I love the whooshing noise they make as they go by.",author);
        Quote quote3 = new Quote(2,"Time is an illusion. Lunchtime doubly so.",author);
        System.out.println(album);
        System.out.println(author);


        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        for (Quote quote:quotes) {
            System.out.println(quote);
        }

    }
}
