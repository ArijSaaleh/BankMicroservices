package eg.agencyservice.repository;

import eg.agencyservice.entities.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepo extends JpaRepository<Agency, Long> {
}
