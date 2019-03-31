package models;

import javax.persistence.*;

@Entity
@Table(name = "\"Address\"",schema = "mcn")
public class Address implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"HouseNumber\"")
    private String houseNumber;

    @ManyToOne
    @JoinColumn(name = "\"Street_id\"")
    private Street street;

    public Address() {
    }

    public Address(String houseNumber, Street street) {
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", houseNumber='" + houseNumber + '\'' +
                ", street=" + street +
                '}';
    }
}
