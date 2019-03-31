package models.real_estate_models;

import models.DatabaseEntity;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "\"RealEstate_certificate\"", schema = "mcn")
public class RealEstateCertificate implements DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"Certificate number\"")
    private String certificateNumber;

    @Column(name = "\"Certificate date\"")
    private Date certificateDate;

    public RealEstateCertificate() {
    }

    public RealEstateCertificate(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public RealEstateCertificate(String certificateNumber, String certificateDate){
        this.certificateNumber = certificateNumber;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.certificateDate = format.parse(certificateDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "Real estate certificate{" +
                "id=" + id +
                ", certificate number='" + certificateNumber + '\'' +
                ", certificate date=" + certificateDate +
                '}';
    }
}
