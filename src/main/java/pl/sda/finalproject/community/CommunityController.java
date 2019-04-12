package pl.sda.finalproject.community;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/communities")
public class CommunityController {
    private CommunityRepository communityRepository;

    public CommunityController(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

    @GetMapping
    public List<Community> get(){
        return communityRepository.findAll();
    }

    @PostMapping
    public Community post(@RequestBody Community community){
        return communityRepository.save(community);
    }
}
