package services.real_estate_services;


import dao.real_estate_daos.RealEstateCertificateDAOImpl;
import models.real_estate_models.RealEstateCertificate;
import services.EntityService;

public class RealEstateCertificateService extends EntityService<RealEstateCertificate> {
    public RealEstateCertificateService() {
        setImpl(new RealEstateCertificateDAOImpl());
    }
}
