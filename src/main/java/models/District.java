package models;

import javax.persistence.*;

@Entity
@Table (name = "\"Districts\"", schema = "mcn")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Name\"")
    private String name;

    @Column(name = "\"FederalEntity_id\"")
    private int federalEntityId;

    public District(){}

    public District(String name, int federalEntityId) {
        this.name = name;
        this.federalEntityId = federalEntityId;
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

    public int getFederalEntityId() {
        return federalEntityId;
    }

    public void setFederalEntityId(int federalEntityId) {
        this.federalEntityId = federalEntityId;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", federalEntityId=" + federalEntityId +
                '}';
    }
}
