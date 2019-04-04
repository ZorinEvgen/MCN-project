package models.errand_models;

import models.DatabaseEntity;

import javax.persistence.*;

@Entity
@Table (name = "\"Errand topics\"", schema = "mcn_errands")
public class ErrandTopic implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Topic name\"")
    private String name;

    public ErrandTopic() {
    }

    public ErrandTopic(String name) {
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
        return "ErrandTopic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
