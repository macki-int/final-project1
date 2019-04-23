package pl.sda.finalproject.init;

import org.springframework.stereotype.Component;
import pl.sda.finalproject.model.Owner;
import pl.sda.finalproject.model.User;
import pl.sda.finalproject.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DBInit {
    private UserRepository userRepository;

    public DBInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        List<User> users = Arrays.asList(
                new User("user1", "password1", User.Role.USER),
                new User("admin", "admin", User.Role.ADMIN)
        );


        users.forEach(userRepository::save);
    }


}
