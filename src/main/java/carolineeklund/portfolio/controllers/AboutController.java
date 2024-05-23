package carolineeklund.portfolio.controllers;

import carolineeklund.portfolio.services.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AboutController {

    private final AboutService aboutService;

    @Autowired
    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/about")
    public String getAbout() {
        return aboutService.getAbout();
    }

    @GetMapping("/about/descriptionParagraph2")
    public String getDescriptionParagraph2() {
        return aboutService.getDescriptionParagraph2();
    }

    @GetMapping("/about/contact")
    public String getContact() {
        return aboutService.getContact();
    }

    @GetMapping("/about/title")
    public String getTitle() {
        return aboutService.getTitle();
    }

    @GetMapping("/about/image")
    public String getImage() {
        return aboutService.getImage();
    }

    @GetMapping("/about/update")
    public void updateAbout(String descriptionParagraph1, String descriptionParagraph2, String contact, String title, String image) {
        aboutService.updateAbout(descriptionParagraph1, descriptionParagraph2, contact, title, image);
    }

    @GetMapping("/about/delete")
    public void deleteAbout() {
        aboutService.deleteAbout();
    }

    @PostMapping("/about/create")
    public void createAbout(String descriptionParagraph1, String descriptionParagraph2, String contact, String title, String image) {
        aboutService.createAbout(descriptionParagraph1, descriptionParagraph2, contact, title, image);
    }




}
