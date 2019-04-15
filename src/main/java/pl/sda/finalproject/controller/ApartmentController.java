package pl.sda.finalproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.finalproject.model.Apartment;
import pl.sda.finalproject.repository.ApartmentRepository;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private ApartmentRepository apartmentRepository;

    public ApartmentController(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @GetMapping
    public List<Apartment> get(){
        return apartmentRepository.findAll();
    }

}
