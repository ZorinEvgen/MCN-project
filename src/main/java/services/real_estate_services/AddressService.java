package services.real_estate_services;

import dao.real_estate_daos.AddressDAOImpl;
import models.real_estate_models.Address;
import services.EntityService;

public class AddressService extends EntityService<Address> {

    public AddressService() {
        setImpl(new AddressDAOImpl());
    }
}
