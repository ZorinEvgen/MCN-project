package models;

import javax.persistence.*;

@Entity
@Table(name = "\"RealEstate\"",schema = "mcn")
public class RealEstate implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Area\"", nullable = false)
    private double area;

    @Column(name = "\"Rooms\"")
    private String rooms;

    @ManyToOne(targetEntity = Address.class)
    @JoinColumn(name = "\"Address_id\"", nullable = false)
    private Address address;

    @ManyToOne(targetEntity = EstateType.class)
    @JoinColumn(name = "\"EstateType_id\"")
    private EstateType estateType;

    @ManyToOne(targetEntity = BuildingType.class)
    @JoinColumn(name = "\"BuildingType_id\"")
    private BuildingType buildingType;

//    @OneToOne
//    @JoinColumn(name = "\"Certificate_of_registration_id\"")
//    private RealEstateCertificate certificate;


    public RealEstate() {
    }

    public RealEstate(double area, Address address) {
        this.area = area;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public EstateType getEstateType() {
        return estateType;
    }

    public void setEstateType(EstateType estateType) {
        this.estateType = estateType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "id=" + id +
                ", area=" + area +
                ", rooms='" + rooms + '\'' +
                ", address=" + address +
                ", estateType=" + estateType +
                ", buildingType=" + buildingType +
                '}';
    }
}
