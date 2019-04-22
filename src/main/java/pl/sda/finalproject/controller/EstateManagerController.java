package pl.sda.finalproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.finalproject.model.EstateManager;
import pl.sda.finalproject.repository.EstateManagerRepository;

import java.util.List;

@RestController
@RequestMapping("/estate-managers")
public class EstateManagerController {
    private EstateManagerRepository estateManagerRepository;

    public EstateManagerController(EstateManagerRepository estateManagerRepository) {
        this.estateManagerRepository = estateManagerRepository;
    }

    @GetMapping
    public List<EstateManager> get() {
        return estateManagerRepository.findAll();
    }
}
