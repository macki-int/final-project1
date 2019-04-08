package pl.sda.finalproject.apartment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.finalproject.owner.Owner;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}
