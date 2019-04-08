package pl.sda.finalproject.owner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String postCode;
    private String city;
    private String numberOfHouse;
    private String numberOfApartment;
    private String phoneNumber;
    private String email;


    public Owner() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public String getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(String numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
