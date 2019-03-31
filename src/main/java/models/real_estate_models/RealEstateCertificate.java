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

    @OneToOne
    @JoinColumn(name = "\"RealEstate_id\"")
    private RealEstate realEstate;

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

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    @Override
    public String toString() {
        return "RealEstateCertificate{" +
                "id=" + id +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", certificateDate=" + certificateDate +
                ", realEstate=" + realEstate +
                '}';
    }
}
