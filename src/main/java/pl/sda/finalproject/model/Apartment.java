package pl.sda.finalproject.model;

import javax.persistence.*;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String postCode;
    private String street;
    private String numberOfHouse;
    private String numberOfApartment;
    private boolean inactive;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private Owner owner;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "community_id", referencedColumnName = "id")
//    private Owner owner;

//    @Entity
//    public class StronaJeden {
//        @Id Long id;
//        @OneToMany(mappedBy="stronaJeden")
//        List stronyWiele;
//    }
//
//    @Entity
//    public class StronaWiele {
//        @Id Long id;
//        @ManyToOne
//        @JoinColumn("strona_jeden_id")
//        StronaJeden stronaJeden;
//    }


    public Apartment() {
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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


}
