package pl.sda.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.finalproject.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
