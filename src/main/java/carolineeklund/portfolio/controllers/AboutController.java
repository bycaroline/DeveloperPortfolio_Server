package carolineeklund.portfolio.controllers;

import carolineeklund.portfolio.models.About;
import carolineeklund.portfolio.models.Project;
import carolineeklund.portfolio.services.AboutService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class AboutController {

    private final AboutService aboutService;

    @Autowired
    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }



    @GetMapping("/about")
    public ResponseEntity<List<About>> getAllAbout() {
        List<About> about = aboutService.getAllAbout();
        return ResponseEntity.ok(about);
    }

    //titlePart1
    @GetMapping("/about/titlePart1")
    public ResponseEntity<String> getTitlePart1() {
        String titlePart1 = aboutService.getTitlePart1();
        return ResponseEntity.ok(titlePart1);
    }


    @PatchMapping("/about/titlePart1")
    public ResponseEntity<Void> updateTitlePart1(@RequestBody Map<String, String> updates) {
        if (updates.containsKey("titlePart1")) {
            aboutService.updateTitlePart1(updates.get("titlePart1"));
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    //titlePart2
    @GetMapping("/about/titlePart2")
    public ResponseEntity<String> getTitlePart2() {
        String titlePart2 = aboutService.getTitlePart2();
        return ResponseEntity.ok(titlePart2);
    }

    @PatchMapping("/about/titlePart2")
    public ResponseEntity<Void> updateTitlePart2(@RequestBody Map<String, String> updates) {
        if (updates.containsKey("titlePart2")) {
            aboutService.updateTitlePart2(updates.get("titlePart2"));
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    //Paragraph1
    @GetMapping("/about/descriptionParagraph1")
    public ResponseEntity<String> getDescriptionParagraph1() {
        String descriptionParagraph1 = aboutService.getDescriptionParagraph1();
        return ResponseEntity.ok(descriptionParagraph1);
    }

    @PatchMapping("/about/descriptionParagraph1")
    public ResponseEntity<Void> updateDescriptionParagraph1(@RequestBody Map<String, String> updates) {
        if (updates.containsKey("descriptionParagraph1")) {
            aboutService.updateDescriptionParagraph1(updates.get("descriptionParagraph1"));
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    //Paragraph2
    @GetMapping("/about/descriptionParagraph2")
    public ResponseEntity<String> getDescriptionParagraph2() {
        String descriptionParagraph2 = aboutService.getDescriptionParagraph2();
        return ResponseEntity.ok(descriptionParagraph2);
    }

    @PatchMapping("/about/descriptionParagraph2")
    public ResponseEntity<Void> updateDescriptionParagraph2(@RequestBody Map<String, String> updates) {
        if (updates.containsKey("descriptionParagraph2")) {
            aboutService.updateDescriptionParagraph2(updates.get("descriptionParagraph2"));
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

//    @PutMapping("/about/descriptionParagraph2")
//    public ResponseEntity<Void> updateDescriptionParagraph2(@RequestBody Map<String, String> updates) {
//        if (updates.containsKey("descriptionParagraph2")) {
//            aboutService.updateDescriptionParagraph2(updates.get("descriptionParagraph2"));
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.badRequest().build();
//        }
//    }

}
