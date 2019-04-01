package services.real_estate_services;

import dao.real_estate_daos.StreetDAOImpl;
import models.real_estate_models.Street;
import services.EntityService;

public class StreetService extends EntityService<Street> {
    public StreetService() {
        setImpl(new StreetDAOImpl());
    }
}
