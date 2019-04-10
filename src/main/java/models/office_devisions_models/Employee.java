package models.office_devisions_models;

import models.DatabaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "\"Employees\"", schema = "mcn_office_devisions")
public class Employee implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Full name\"")
    private String name;

    @Column(name = "\"Date of birth\"")
    private Date birthDate;

    @ManyToOne
    @JoinColumn(name = "\"Devision_id\"")
    private Devision devision;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Date birthDate, Devision devision) {
        this.name = name;
        this.birthDate = birthDate;
        this.devision = devision;
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Devision getDevision() {
        return devision;
    }

    public void setDevision(Devision devision) {
        this.devision = devision;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", devision=" + devision +
                '}';
    }
}
