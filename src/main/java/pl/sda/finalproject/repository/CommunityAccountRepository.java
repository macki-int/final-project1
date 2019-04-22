package pl.sda.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.model.CommunityAccount;

@Repository
public interface CommunityAccountRepository extends JpaRepository<CommunityAccount, Long> {

}
