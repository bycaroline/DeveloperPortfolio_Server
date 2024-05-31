package carolineeklund.portfolio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "projects")
public class Project {
    @Id
    private String id;
    private char nrInRow;
    private String name;
    private String description;
    private List <String> functionalities;
    private List <String> process;
    private List<String> technologies;
    private String iconImage;
    private String image;
    private String demo;
    private String github;

}
