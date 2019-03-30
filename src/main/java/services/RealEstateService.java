package services;

import dao.RealEstateDAOImpl;
import models.RealEstate;

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
