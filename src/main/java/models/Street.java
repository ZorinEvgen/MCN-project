package models;

import javax.persistence.*;

@Entity
@Table(name = "\"Streets\"", schema = "mcn")
public class Street implements DatabaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"StreetName\"")
    private String name;

    @ManyToOne
    @JoinColumn(name = "\"District_id\"")
    private District district;

    public Street() {
    }

    public Street(String name) {
        this.name = name;
    }

    public Street(String name, District district) {
        this.name = name;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district=" + district +
                '}';
    }
}
