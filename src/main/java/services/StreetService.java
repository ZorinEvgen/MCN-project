package services;

import dao.StreetDAOImpl;
import models.Street;

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
