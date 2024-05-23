package carolineeklund.portfolio.controllers;

import carolineeklund.portfolio.models.Project;
import carolineeklund.portfolio.repositories.ProjectRepository;
import carolineeklund.portfolio.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public ResponseEntity <List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity.ok(projects);
    }

    @GetMapping("/projects/{id}")
    public ResponseEntity <Project> getProject(@PathVariable String id) {
        Project project = projectService.getProject(id);
        if (project != null) {
            return ResponseEntity.ok(project);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping("/projects/{id}")
//    public ResponseEntity <Project> getProjectByName(String name) {
//        Project project = projectService.getProject(name);
//        return ResponseEntity.ok(project);
//    }

}
