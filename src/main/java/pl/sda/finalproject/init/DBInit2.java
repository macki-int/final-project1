package pl.sda.finalproject.init;

import org.springframework.stereotype.Component;
import pl.sda.finalproject.model.Owner;
import pl.sda.finalproject.model.User;
import pl.sda.finalproject.repository.OwnerRepository;
import pl.sda.finalproject.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DBInit2 {
    private UserRepository userRepository;
    private OwnerRepository ownerRepository;
    private Owner owner;

    public DBInit2(UserRepository userRepository, OwnerRepository ownerRepository) {
        this.userRepository = userRepository;
        this.ownerRepository = ownerRepository;
    }

    @PostConstruct
    public void init() {
        List<User> users = Arrays.asList(
                new User("user1", "password1", User.Role.USER),
                new User("admin", "admin", User.Role.ADMIN)
        );
        users.forEach(userRepository::save);



        owner = new Owner(
                "Adam",
                "Kowalski",
                "44-100",
                "Gliwice",
                "3a",
                "10",
                "32 370 06 06",
                "test@com.com"
        );


        ownerRepository.save(owner);
    }


}
