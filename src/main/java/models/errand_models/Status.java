package models.errand_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "\"Status\"", schema = "mcn_errands")
public class Status implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Status\"")
    private String status;

    public Status() {
    }

    public Status(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
