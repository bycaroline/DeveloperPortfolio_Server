package carolineeklund.portfolio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "index")
public class Index {
    private String title;
    private String description;
    private String image;
    private String github;
    private String linkedin;
    private String email;
    private String about;
    private String projects;
}
