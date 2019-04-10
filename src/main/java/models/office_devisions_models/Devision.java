package models.office_devisions_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "\"Devision\"", schema = "mcn_office_devisions")
public class Devision implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Name\"", nullable = false)
    private String Name;

    @ManyToOne
    @JoinColumn(name = "\"Office_id\"")
    private Office office;

    public Devision() {
    }

    public Devision(String name) {
        Name = name;
    }

    public Devision(String name, Office office) {
        Name = name;
        this.office = office;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Devision{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", office=" + office +
                '}';
    }
}
