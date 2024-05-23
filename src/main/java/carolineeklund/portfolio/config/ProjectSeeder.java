package carolineeklund.portfolio.config;

import carolineeklund.portfolio.models.Project;
import carolineeklund.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectSeeder implements CommandLineRunner {

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

        Project garnGalore = new Project();
        garnGalore.setNrInRow('a');
        garnGalore.setName("webshop with java");
        garnGalore.setDescription("Java webshop team project at Campus Mölndal. A web application that manages an e-commerce platform selling yarn, where users can explore products, add them to a shopping cart, and complete purchases.");
        garnGalore.setFunctionalities(List.of(
                "Product Display: Users can browse products.",
                "Search Functionality: Ability to search for products based on name, description or color.",
                "Product Details: Users can view detailed information about a product, including name, price, description, and quantity.",
                "Shopping Cart: Users can add products to a shopping cart and view the total price of the items.",
                "Checkout Process: Users can complete purchases by providing shipping and payment information.",
                "User Authentication: Users can create accounts, log in, and log out of the application.",
                "Shopping Cart: Users can add products to a shopping cart and view their current cart based on their session.",
                "Ordering: Users can place orders for the products in their shopping cart.",
                "User Registration and Login: Ability for users to register and log in for a more personalized experience."
        ));
        garnGalore.setProcess(List.of(
                "Scrum: The team used the Scrum methodology for collaboration and implemented backlog and daily morning meetings.",
                "Version Control: Git and branches were used for code collaboration."
        ));
        garnGalore.setTechnologies(List.of("Java", "Spring Boot", "MongoDB", "Thymeleaf", "Javascript"));
        garnGalore.setIconImage("/images/iconGarnGalore.jpg");
        garnGalore.setImage("/images/GarnGalore.jpg");
        garnGalore.setDemo("");
        garnGalore.setGithub("https://github.com/bycaroline/TeamProject_Webshop");

        Project familyRecipes = new Project();
        familyRecipes.setNrInRow('b');
        familyRecipes.setName("family recipes");
        familyRecipes.setDescription("Recipe database and CRUD operations on family recipes for family members. Built with Node and javascript in the backend and React in the frontend, thereby implementing the so called MERN stack.");
        familyRecipes.setFunctionalities(List.of(
                "Database Storage: Recipes are stored in MongoDB in the backend and retrieved via React in the frontend.",
                "Search Functionality: Users can search for recipes based on name or ingredients.",
                "User Authentication: Users can create accounts, log in, and log out of the application.",
                "Recipe Details: Users can view detailed information about a recipe, including who created it.",
                "Recipe Creation and Updates: Users can create new recipes and add them to the database as well as update their recipes.",
                "Comment Functionality: Users can write comments on recipes.",
                "Loading Spinner: The application is hosted free so the application takes some time to load and a loading spinner is implemented."
        ));
        familyRecipes.setProcess(List.of(
                "Backlog: Backlog for the frontend and backend was created.",
                "Design: The frontend design was set up in Figma."
        ));
        familyRecipes.setTechnologies(List.of("Node", "Express", "MongoDB", "React", "Javascript"));
        familyRecipes.setIconImage("/images/iconFamilyRecipes.jpg");
        familyRecipes.setImage("/images/FamilyRecepiesImg.png");
        familyRecipes.setDemo("https://familyrecepies.onrender.com/");
        familyRecipes.setGithub("https://github.com/bycaroline/MERNappServerRecepies");

        Project photoPortfolio = new Project();
        photoPortfolio.setNrInRow('c');
        photoPortfolio.setName("photo portfolio");
        photoPortfolio.setDescription("React JS is used to build this Portfolio to showcase my work in photography.");
        photoPortfolio.setFunctionalities(List.of(
                "Responsive: The website is built to adjust to the screen size.",
                "Gallery: The design of the website is created to highlight the photos using a Swiper component.",
                "Hooks: Hooks are used to create a responsive menu.",
                "Contact form: Possible to send a contact message using the javascript library Email JS.",
                "Future improvements: Since the site is heavy with photos, being a photo portfolio, the site could benefit to be built in NEXT JS so that the images could be lazy loaded."
        ));
        photoPortfolio.setProcess(List.of());
        photoPortfolio.setTechnologies(List.of("React", "Javascript", "HTML", "CSS"));
        photoPortfolio.setIconImage("/images/iconPhotoPortfolio.jpg");
        photoPortfolio.setImage("/images/PhotoPortfolioImg.png");
        photoPortfolio.setDemo("");
        photoPortfolio.setGithub("https://github.com/bycaroline/PhotographyPortfolioPublic");

        Project surfNotificationAlert = new Project();
        surfNotificationAlert.setNrInRow('d');
        surfNotificationAlert.setName("surf notification alert");
        surfNotificationAlert.setDescription("Weather api and mail sender for surf notifications. This surf app uses weather data from SMHI api (Swedish Meteorological and Hydrological Institute) and detects if good surf conditions might be expected at Knäbäckshusen in Sweden. If good conditions can be expected, every subscriber will receive a notification by email the day before.");
        surfNotificationAlert.setFunctionalities(List.of(
                "Weather info: The SMHI api is called to gather future weather info.",
                "Database storage: The subscribed users emails are saved on MongoDb Atlas.",
                "Mail: Nodemailer sends emails to subscribers when surf conditions may be good.",
                "Future improvements: Setting up more surf spots than one from which the subscribers can choose between."
        ));
        surfNotificationAlert.setProcess(List.of(
                "Calling Api: I started building this app by setting up calling the SMHI api and defining the conditions for the wind detection.",
                "Emails and Database: After that I set up nodemailer and saving subscribed emails into MongoDB Atlas.",
                "Frontend: Lastly I built the frontend using first Figma and then CSS. The app is hosted on a free hosting service so please be patient for it to load.",
                "Hosting: The app is hosted on a free hosting service so please be patient for it to load."
                ));
        surfNotificationAlert.setTechnologies(List.of("Node", "Express", "Axios", "MongoDB", "Nodemailer"));
        surfNotificationAlert.setIconImage("/images/iconSurfNotification.jpg");
        surfNotificationAlert.setImage("/images/SurfAppImg.png");
        surfNotificationAlert.setDemo("https://surfapp.onrender.com");
        surfNotificationAlert.setGithub("https://github.com/bycaroline/SurfAppPublic");

        Project surfGame = new Project();
        surfGame.setNrInRow('e');
        surfGame.setName("surf game");
        surfGame.setDescription("Exploring the basics of Javascript with this surf game. It currently only runs on laptops.");
        surfGame.setFunctionalities(List.of(
                "Keyboard movements: The surfer moves according to keyboard inputs.",
                "Timer: The waves appear on random counts.",
                "Obstacles: Other surfers catching waves before the player reaches it."
        ));
        surfGame.setProcess(List.of());
        surfGame.setTechnologies(List.of("Javascript", "HTML", "CSS"));
        surfGame.setIconImage("/images/iconSurfGame.jpg");
        surfGame.setImage("/images/SurfGameImg.png");
        surfGame.setDemo("");
        surfGame.setGithub("https://github.com/bycaroline/SurfGamePublic");

        Project developerPortfolio = new Project();
        developerPortfolio.setNrInRow('f');
        developerPortfolio.setName("developer portfolio");
        developerPortfolio.setDescription("Java and React project to showcase my skills, projects, and experience as a developer. The project is built with Java in the backend and React in the frontend.");
        developerPortfolio.setFunctionalities(List.of(
                "Database Storage: Projects are stored in MongoDB in the backend and retrieved via React in the frontend.",
                "Future improvements: An authentication process will be implemented so that it is possible to update, delete and create new projects directly in the application."
        ));
        developerPortfolio.setProcess(List.of(
                "Backlog: Backlog for the frontend and backend was created.",
                "Version Control: Git was used for version control.",
                "Design: The frontend design was set up in Figma."
        ));
        developerPortfolio.setTechnologies(List.of("Java", "Spring Boot", "MongoDB", "React", "Javascript"));
        developerPortfolio.setIconImage("/images/iconDeveloperPortfolio.jpg");
        developerPortfolio.setImage("/images/DeveloperPortfolio.jpg");
        developerPortfolio.setDemo("");
        developerPortfolio.setGithub("https://github.com/bycaroline/DeveloperPortfolio_Server");

        // Save products to the database
        projectRepository.save(surfGame);
        projectRepository.save(surfNotificationAlert);
        projectRepository.save(photoPortfolio);
        projectRepository.save(familyRecipes);
        projectRepository.save(garnGalore);
        projectRepository.save(developerPortfolio);
    }

}
