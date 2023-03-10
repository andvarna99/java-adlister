package java_beans;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Author{" + id +
                ", " + firstName +
                " " + lastName +
                '}';
    }
}
