package models.real_estate_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table (name = "\"Districts\"", schema = "mcn_real_estate")
public class District implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Name\"")
    private String name;

    @ManyToOne (targetEntity = FederalEntity.class)
    @JoinColumn (name = "\"FederalEntity_id\"")
    private FederalEntity federalEntity;

    public District() {
    }

    public District(String name) {
        this.name = name;
    }

    public District(String name, FederalEntity federalEntity) {
        this.name = name;
        this.federalEntity = federalEntity;
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

    public FederalEntity getFederalEntity() {
        return federalEntity;
    }

    public void setFederalEntity(FederalEntity federalEntity) {
        this.federalEntity = federalEntity;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", federalEntity=" + federalEntity +
                '}';
    }
}
