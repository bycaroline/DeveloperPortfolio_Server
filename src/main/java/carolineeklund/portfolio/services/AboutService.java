package carolineeklund.portfolio.services;

import carolineeklund.portfolio.models.About;
import carolineeklund.portfolio.repositories.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    @Autowired
    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public String getAbout() {
        return aboutRepository.findAll().get(0).getDescriptionParagraph1();
    }

    public String getDescriptionParagraph2() {
        return aboutRepository.findAll().get(0).getDescriptionParagraph2();
    }

    public String getContact() {
        return aboutRepository.findAll().get(0).getContact();
    }

    public String getTitle() {
        return aboutRepository.findAll().get(0).getTitle();
    }

    public String getImage() {
        return aboutRepository.findAll().get(0).getImage();
    }

    public void updateAbout(String descriptionParagraph1, String descriptionParagraph2, String contact, String title, String image) {
        aboutRepository.findAll().get(0).setDescriptionParagraph1(descriptionParagraph1);
        aboutRepository.findAll().get(0).setDescriptionParagraph2(descriptionParagraph2);
        aboutRepository.findAll().get(0).setContact(contact);
        aboutRepository.findAll().get(0).setTitle(title);
        aboutRepository.findAll().get(0).setImage(image);
        aboutRepository.save(aboutRepository.findAll().get(0));
    }

    public void deleteAbout() {
        aboutRepository.deleteAll();
    }

    public void createAbout(String descriptionParagraph1, String descriptionParagraph2, String contact, String title, String image) {
        aboutRepository.save(new About(descriptionParagraph1, descriptionParagraph2, contact, title, image));
    }


}
