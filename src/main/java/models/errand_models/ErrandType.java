package models.errand_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "\"Errand types\"",schema = "mcn_errands")
public class ErrandType implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Type\"")
    private String type;

    public ErrandType() {
    }

    public ErrandType(String type) {
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
        return "ErrandType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
