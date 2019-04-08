package pl.sda.finalproject.community;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.owner.Owner;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Long> {

}
