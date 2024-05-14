package carolineeklund.portfolio.repositories;

import carolineeklund.portfolio.models.Index;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexRepository extends MongoRepository<Index, String> {
}
