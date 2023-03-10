package java_beans;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;

    @Override
    public String toString() {
        return "Quote{" + id +
                ", \"" + content + '\"' +
                ", " + author +
                '}';
    }
}
