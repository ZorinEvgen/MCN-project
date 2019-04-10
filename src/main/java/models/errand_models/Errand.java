package models.errand_models;

import models.DatabaseEntity;
import models.office_devisions_models.Employee;
import models.real_estate_models.RealEstate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "\"Errand\"", schema = "mcn_errands")
public class Errand implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Incoming number\"")
    private String incomingNumber;

    @Column(name = "\"Outcoming number\"")
    private String outcomingNumber;

    @Column(name = "\"Errand date\"")
    private Date errandDate;

    @ManyToMany
    @JoinColumn(name = "\"RealEstate_id\"")
    private List<RealEstate> realEstates;

    @ManyToOne
    @JoinColumn(name = "\"Errand topic_id\"")
    private ErrandTopic topic;

    @ManyToOne
    @JoinColumn(name = "\"Responsible employee_id\"")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "\"Status_id\"")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "\"Errand type_id\"")
    private ErrandType type;

    @Column(name = "\"Deadline\"")
    private Date deadline;

    @Column(name = "\"Information\"")
    private String information;

    @ManyToMany(targetEntity = Errand.class)
    @JoinColumn(name = "\"Related errand_id\"")
    private List<Errand> errands;

    public Errand() {
    }

    public Errand(String outcomingNumber, ErrandTopic topic) {
        this.outcomingNumber = outcomingNumber;
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    public String getIncomingNumber() {
        return incomingNumber;
    }

    public void setIncomingNumber(String incomingNumber) {
        this.incomingNumber = incomingNumber;
    }

    public String getOutcomingNumber() {
        return outcomingNumber;
    }

    public void setOutcomingNumber(String outcomingNumber) {
        this.outcomingNumber = outcomingNumber;
    }

    public Date getErrandDate() {
        return errandDate;
    }

    public void setErrandDate(Date errandDate) {
        this.errandDate = errandDate;
    }

    public List<RealEstate> getRealEstates() {
        return realEstates;
    }

    public void setRealEstates(List<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public ErrandTopic getTopic() {
        return topic;
    }

    public void setTopic(ErrandTopic topic) {
        this.topic = topic;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ErrandType getType() {
        return type;
    }

    public void setType(ErrandType type) {
        this.type = type;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public List<Errand> getErrands() {
        return errands;
    }

    public void setErrands(List<Errand> errands) {
        this.errands = errands;
    }

    @Override
    public String toString() {
        return "Errand{" +
                "id=" + id +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", outcomingNumber='" + outcomingNumber + '\'' +
                ", errandDate=" + errandDate +
                ", realEstates=" + realEstates +
                ", topic=" + topic +
                ", employee=" + employee +
                ", status='" + status + '\'' +
                ", type=" + type +
                ", deadline=" + deadline +
                ", information='" + information + '\'' +
                ", errands=" + errands +
                '}';
    }
}
