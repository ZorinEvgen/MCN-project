package models;

import javax.persistence.*;

@Entity
@Table (name = "\"EstateType\"", schema = "mcn")
public class EstateType implements DatabaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Type\"")
    private String type;

    public EstateType() {
    }

    public EstateType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EstateType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
