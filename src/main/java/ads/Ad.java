package ads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ad {
//    this is the Ad bean
    private long id;
    private String title;
    private String description;
    private long userId;

}
