package pl.sda.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.model.Community;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> {

}
