package pl.sda.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.model.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}
