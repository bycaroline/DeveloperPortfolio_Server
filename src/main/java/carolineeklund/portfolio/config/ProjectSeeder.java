package carolineeklund.portfolio.config;

import carolineeklund.portfolio.models.Project;
import carolineeklund.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectSeeder {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectSeeder(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void run(String... args) {
        // Check if products already exist
        List<Project> existingProjects = projectRepository.findAll();

        // If no products exist, seed product data
        if (existingProjects.isEmpty()) {
            seedProducts();
        }
    }

    private void seedProducts() {
        // Seed product data
        Project project1 = new Project();
        project1.setName("Lila ekologiskt garn");
        project1.setDescription("Det här är min portfolio");
        project1.setImage("");
        project1.setDemo("");
        project1.setGithub("");
        project1.setTechnologies(List.of("Java", "Spring Boot", "MongoDB"));

        // Save products to the database
        projectRepository.save(project1);
    }

}
