package carolineeklund.portfolio.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "about")
public class About {
    @Id
    private String id;
    private String descriptionParagraph1;
    private String descriptionParagraph2;
    private String image;
    private String contact;
    private String titlePart1;
    private String titlePart2;
}
