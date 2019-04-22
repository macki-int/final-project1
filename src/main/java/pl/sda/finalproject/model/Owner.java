package pl.sda.finalproject.model;

import javax.persistence.*;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String postCode;
    private String city;
    private String numberOfHouse;
    private String numberOfApartment;
    private String phone;
    private String email;
    @OneToOne(mappedBy = "owner")
    private User user;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="apartment_id", referencedColumnName = "id")
//    private Apartment apartment;


    public Owner() {
    }

    public Owner(String firstName, String lastName, String postCode, String city, String numberOfHouse, String numberOfApartment, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;
        this.city = city;
        this.numberOfHouse = numberOfHouse;
        this.numberOfApartment = numberOfApartment;
        this.phone = phone;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
