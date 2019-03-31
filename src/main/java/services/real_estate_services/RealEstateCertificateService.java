package services.real_estate_services;

import dao.real_estate_daos.RealEstateCertificateDAOImpl;
import models.real_estate_models.RealEstateCertificate;
import services.DatabaseEntityService;

public class RealEstateCertificateService implements DatabaseEntityService<RealEstateCertificate> {
    private RealEstateCertificateDAOImpl impl = new RealEstateCertificateDAOImpl();

    public RealEstateCertificate findById(int id) {
        return impl.findById(id);
    }

    public void save(RealEstateCertificate realEstateCertificate) {
        impl.save(realEstateCertificate);
    }

    public void update(RealEstateCertificate realEstateCertificate) {
        impl.update(realEstateCertificate);
    }

    public void delete(RealEstateCertificate realEstateCertificate) {
        impl.delete(realEstateCertificate);
    }
}
