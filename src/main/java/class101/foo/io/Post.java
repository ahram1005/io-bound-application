package class101.foo.io;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "post")
public class Post {
    @Id
    private String id;
    private String content;
}
