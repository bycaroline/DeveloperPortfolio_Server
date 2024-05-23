package carolineeklund.portfolio.config;

import carolineeklund.portfolio.models.About;
import carolineeklund.portfolio.repositories.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AboutSeeder implements CommandLineRunner {

    private final AboutRepository aboutRepository;

    @Autowired
    public AboutSeeder(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    @Override
    public void run(String... args) {
        // Check if products already exist
        List<About> existingAbout = aboutRepository.findAll();

        // If no products exist, seed product data
        if (existingAbout.isEmpty()) {
            seedAbout();
        }
    }

    private void seedAbout() {
        // Seed skills data

        About about = new About();
        about.setTitle("Caroline Eklund");
        about.setDescriptionParagraph1("I am currently enrolled in a two-year Java program at Campus Mölndal in Gothenburg. I am entering my second year this fall. My portfolio showcases some of the projects I have worked on during my Java studies, as well as projects from my previous studies in frontend development." );
        about.setDescriptionParagraph2("One of the projects is a webshop that I developed collaboratively with other students in my program. During this project, we implemented the Scrum methodology and utilized version control with Git. Another project featured in my portfolio is this website itself, which consists of a Java server in the backend and a React client in the frontend.");
        about.setContact("eklund.caroline@gmail.com");
        about.setImage("");
        aboutRepository.save(about);

    }

}


