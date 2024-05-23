package carolineeklund.portfolio.config;

import carolineeklund.portfolio.models.Skills;
import carolineeklund.portfolio.repositories.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SkillsSeeder implements CommandLineRunner {

    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsSeeder(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public void run(String... args) {
        // Check if products already exist
        List<Skills> existingSkills = skillsRepository.findAll();

        // If no products exist, seed product data
        if (existingSkills.isEmpty()) {
            seedSkills();
        }
    }

    private void seedSkills() {
        // Seed skills data

        Skills java = new Skills();
        java.setName("Java");
        java.setImage("/skillsImages/java.png");

        Skills html = new Skills();
        html.setName("HTML");
        html.setImage("/skillsImages/html.png");

        Skills css = new Skills();
        css.setName("CSS");
        css.setImage("/skillsImages/css.png");

        Skills javascript = new Skills();
        javascript.setName("JavaScript");
        javascript.setImage("/skillsImages/javascript.png");

        Skills react = new Skills();
        react.setName("React");
        react.setImage("/skillsImages/react.png");

        Skills spring = new Skills();
        spring.setName("Spring");
        spring.setImage("/skillsImages/Spring.png");

        Skills sql = new Skills();
        sql.setName("SQL");
        sql.setImage("/skillsImages/mysql.png");

        Skills git = new Skills();
        git.setName("Git");
        git.setImage("/skillsImages/git.png");

        Skills mongoDB = new Skills();
        mongoDB.setName("MongoDB");
        mongoDB.setImage("/skillsImages/mong.png");

        Skills node = new Skills();
        node.setName("Node.js");
        node.setImage("/skillsImages/node.png");

        skillsRepository.save(java);
        skillsRepository.save(html);
        skillsRepository.save(css);
        skillsRepository.save(javascript);
        skillsRepository.save(react);
        skillsRepository.save(spring);
        skillsRepository.save(sql);
        skillsRepository.save(git);
        skillsRepository.save(mongoDB);
        skillsRepository.save(node);

    }

}

