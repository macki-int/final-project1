package pl.sda.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.finalproject.model.Owner;
import pl.sda.finalproject.repository.OwnerRepository;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    private OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @GetMapping("/{id}")
    public Owner get(@PathVariable long id){
        return ownerRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Owner is not exist in DB"));
    }
}
