package pl.sda.finalproject.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Secured({"ROLE_ADMIN","ROLE_WORKER"})
    @GetMapping
    public List<Apartment> get(){
        return apartmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Apartment get(@PathVariable Long id){
        return apartmentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Apartment is not exist in DB"));
    }

    @GetMapping("/community/{id}")
    public List<Apartment> getByCommunityId(@PathVariable Long id){
        return apartmentRepository.findByCommunityId(id);

    }@GetMapping("/owner/{id}")
    public List<Apartment> getByOwnerId(@PathVariable Long id){
        return apartmentRepository.findByOwnerId(id);

    }

}
