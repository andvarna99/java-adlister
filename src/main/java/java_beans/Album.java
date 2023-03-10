package java_beans;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private int releaseDate;
    private double sales;
    private String genre;

    @Override
    public String toString() {
        return "Album{" + id +", " + artist +", "+ albumName +
                ", releaseDate:" + releaseDate +
                ", sales:" + sales + "M, " + "genre: '" + genre + "'"+
                '}';
    }
}
