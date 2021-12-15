package eg.credit.repository;

import eg.credit.entity.Credit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CreditRepo extends JpaRepository<Credit, Integer> {
    @Query("select c from Credit c where c.ClientId like :ClientId")
    public Page<Credit> creditByClientId(@Param("ClientId") String ci, Pageable pageable);
}