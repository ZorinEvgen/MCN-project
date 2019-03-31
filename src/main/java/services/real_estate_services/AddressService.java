package services.real_estate_services;

import dao.real_estate_daos.AddressDAOImpl;
import models.real_estate_models.Address;
import services.DatabaseEntityService;

public class AddressService implements DatabaseEntityService<Address> {
    private AddressDAOImpl impl = new AddressDAOImpl();

    public Address findById(int id) {
        return impl.findById(id);
    }

    public void save(Address address) {
        impl.save(address);
    }

    public void update(Address address) {
        impl.update(address);
    }

    public void delete(Address address) {
         impl.delete(address);
    }
}
