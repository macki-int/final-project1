package pl.sda.finalproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.finalproject.model.CommunityAccount;
import pl.sda.finalproject.repository.CommunityAccountRepository;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class CommunityAccountController {
    private CommunityAccountRepository communityAccountRepository;

    public CommunityAccountController(CommunityAccountRepository communityAccountRepository) {
        this.communityAccountRepository = communityAccountRepository;
    }

    @GetMapping
    public List<CommunityAccount> get(){
        return communityAccountRepository.findAll();
    }

}
