package pl.sda.finalproject.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.finalproject.model.User;
import pl.sda.finalproject.repository.UserRepository;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> get() {
        return userRepository.findAll();
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admins")
    public List<User> getAdmins() {
        return userRepository.findAll();
    }

    @Secured("ROLE_USER")
    @GetMapping("/users")
    public List<User> getUsers() {
        //TODO
        //return userRepository.findAll();
        return null;
    }

    @Secured("ROLE_VIEWER")
    @GetMapping("/viewers")
    public User getViewer(Principal principal) {
        String username = principal.getName();
        return userRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException());
        //TODO - sprawdzić jak i dlaczego
    }
}
