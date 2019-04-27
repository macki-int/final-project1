package pl.sda.finalproject.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.sda.finalproject.model.Community;
import pl.sda.finalproject.repository.CommunityRepository;

import java.util.List;

@RestController
@RequestMapping("/communities")
public class CommunityController {
    private CommunityRepository communityRepository;

    public CommunityController(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

    @Secured({"ROLE_ADMIN", "ROLE_WORKER"})
    @GetMapping
    public List<Community> get(){
        return communityRepository.findAll();
    }

    @GetMapping("/{id}")
    public Community get(@PathVariable long id){
        return communityRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Community is not exist in DB"));
    }


    @PostMapping
    public Community post(@RequestBody Community community){
        return communityRepository.save(community);
    }
}
