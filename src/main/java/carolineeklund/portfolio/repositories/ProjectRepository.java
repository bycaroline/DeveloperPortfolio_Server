package carolineeklund.portfolio.repositories;

import carolineeklund.portfolio.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
