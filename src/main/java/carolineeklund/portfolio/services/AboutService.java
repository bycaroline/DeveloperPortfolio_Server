package carolineeklund.portfolio.services;

import carolineeklund.portfolio.models.About;
import carolineeklund.portfolio.repositories.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    @Autowired
    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public List<About> getAllAbout() {
        return aboutRepository.findAll();
    }

    //titlePart1
    public String getTitlePart1() {
        return aboutRepository.findAll().get(0).getTitlePart1();
    }

    public void updateTitlePart1(String titlePart1) {
        About about = aboutRepository.findAll().get(0);
        if (titlePart1 != null && !titlePart1.isEmpty()){
            about.setTitlePart1(titlePart1);
            aboutRepository.save(about);
        }
    }

    //titlePart2
    public String getTitlePart2() {
        return aboutRepository.findAll().get(0).getTitlePart2();
    }

    public void updateTitlePart2(String titlePart2) {
        About about = aboutRepository.findAll().get(0);
        if (titlePart2 != null && !titlePart2.isEmpty()) {
            about.setTitlePart2(titlePart2);
            aboutRepository.save(about);
        }
    }

    //Paragraph1
    public String getDescriptionParagraph1() {
        About about = aboutRepository.findAll().get(0);
        String descriptionParagraph1 = about.getDescriptionParagraph1();
        return descriptionParagraph1;
    }

    public void updateDescriptionParagraph1(String descriptionParagraph1) {
        About about = aboutRepository.findAll().get(0);
        if (descriptionParagraph1 != null && !descriptionParagraph1.isEmpty()) {
            about.setDescriptionParagraph1(descriptionParagraph1);
            aboutRepository.save(about);
        }
    }

    //Paragraph2
    public String getDescriptionParagraph2() {
        About about = aboutRepository.findAll().get(0);
        return about.getDescriptionParagraph2();
    }

    public void updateDescriptionParagraph2(String descriptionParagraph2) {
        About about = aboutRepository.findAll().get(0);
        if (descriptionParagraph2 != null && !descriptionParagraph2.isEmpty()) {
            about.setDescriptionParagraph2(descriptionParagraph2);
            aboutRepository.save(about);
        }
    }

    //PUT testing instead
//    public void updateDescriptionParagraph2(String descriptionParagraph2) {
//        List<About> aboutList = aboutRepository.findAll();
//        if (!aboutList.isEmpty()) {
//            About about = aboutList.get(0);
//            if (descriptionParagraph2 != null && !descriptionParagraph2.isEmpty()) {
//                about.setDescriptionParagraph2(descriptionParagraph2);
//                aboutRepository.save(about);
//            }
//        }
//    }


}
