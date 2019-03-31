package services.real_estate_services;

import dao.real_estate_daos.RealEstateDAOImpl;
import models.real_estate_models.RealEstate;
import services.DatabaseEntityService;

public class RealEstateService implements DatabaseEntityService<RealEstate> {
    private RealEstateDAOImpl impl = new RealEstateDAOImpl();

    public RealEstate findById(int id) {
        return impl.findById(id);
    }

    public void save(RealEstate realEstate) {
        impl.save(realEstate);
    }

    public void update(RealEstate realEstate) {
        impl.update(realEstate);
    }

    public void delete(RealEstate realEstate) {
        impl.delete(realEstate);
    }
}
