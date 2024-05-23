package carolineeklund.portfolio.controllers;

import carolineeklund.portfolio.models.Skills;
import carolineeklund.portfolio.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/skills")
    public ResponseEntity <List<Skills>> getAllSkills() {
        List<Skills> skills = skillsService.getAllSkills();
        return ResponseEntity.ok(skills);
    }

    @GetMapping("/skills/{id}")
    public ResponseEntity <Skills> getSkill(@PathVariable String id) {
        Skills skill = skillsService.getSkill(id);
        if (skill != null) {
            return ResponseEntity.ok(skill);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/skills/{name}")
    public ResponseEntity <Skills> getSkillByName(String name) {
        Skills skill = skillsService.getSkillByName(name);
        return ResponseEntity.ok(skill);
    }


}
