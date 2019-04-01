package services.real_estate_services;

import dao.real_estate_daos.RealEstateDAOImpl;
import models.real_estate_models.RealEstate;
import services.EntityService;

public class RealEstateService extends EntityService<RealEstate> {
    public RealEstateService() {
        setImpl(new RealEstateDAOImpl());
    }
}
