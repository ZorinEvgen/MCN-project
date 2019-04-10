package models.office_devisions_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "\"Office\"", schema = "mcn_office_devisions")
public class Office implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Name\"")
    private String name;

    public Office() {
    }

    public Office(String name) {
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
        return "Office{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
