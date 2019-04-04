package models.errand_models;

import models.DatabaseEntity;
import models.office_devisions_models.Employee;
import models.real_estate_models.RealEstate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"Inspections\"", schema = "mcn_errands")
public class Inspection implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Date of inspection\"")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "\"Employee_id\"")
    private Employee employee;

    @ManyToMany
    @JoinColumn(name = "\"RealEstate_id\"")
    private List<RealEstate> realEstates;

    public Inspection() {
    }

    public Inspection(Date date, Employee employee) {
        this.date = date;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "id=" + id +
                ", date=" + date +
                ", employee=" + employee +
                ", realEstates=" + realEstates +
                '}';
    }
}
