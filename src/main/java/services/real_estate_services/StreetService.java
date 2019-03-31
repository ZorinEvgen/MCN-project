package services.real_estate_services;

import dao.real_estate_daos.StreetDAOImpl;
import models.real_estate_models.Street;
import services.DatabaseEntityService;

public class StreetService implements DatabaseEntityService<Street> {
    private StreetDAOImpl impl = new StreetDAOImpl();

    public Street findById(int id) {
        return impl.findById(id);
    }

    public void save(Street street) {
        impl.save(street);
    }

    public void update(Street street) {
        impl.update(street);
    }

    public void delete(Street street) {
        impl.delete(street);
    }
}
