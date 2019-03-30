package models;

import javax.persistence.*;

@Entity
@Table (name = "\"FederalEntities\"", schema = "mcn")
public class FederalEntity implements DatabaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Name\"")
    private String name;

    public FederalEntity() {
    }

    public FederalEntity(String name){
        this.name = name;
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

    @Override
    public String toString() {
        return "FederalEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
