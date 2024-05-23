package carolineeklund.portfolio.services;

import carolineeklund.portfolio.models.Skills;
import carolineeklund.portfolio.repositories.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public void createSkill(Skills skill) {
        skillsRepository.save(skill);
    }

    public void updateSkill(Skills skill) {
        skillsRepository.save(skill);
    }

    public void deleteSkill(String id) {
        skillsRepository.deleteById(id);
    }

    public Skills getSkill(String id) {
        return skillsRepository.findById(id).orElse(null);
    }

    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    public Skills getSkillByName(String name) {
        return skillsRepository.findByName(name);
    }


}
