package pl.sda.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.model.EstateManager;

@Repository
public interface EstateManagerRepository extends JpaRepository<EstateManager, Long> {
//    Optional<EstateManager> findFirstBy();

}
