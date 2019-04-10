package pl.sda.finalproject.community;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/communities")
public class CommunityController {
    private CommunityRepository communityRepository;
}
