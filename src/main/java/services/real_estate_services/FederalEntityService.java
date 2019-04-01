package services.real_estate_services;

import dao.real_estate_daos.FederalEntitiesDAOImpl;
import models.real_estate_models.FederalEntity;
import services.EntityService;

public class FederalEntityService extends EntityService<FederalEntity> {
    public FederalEntityService() {
        setImpl(new FederalEntitiesDAOImpl());
    }
}
