package services.real_estate_services;

import dao.real_estate_daos.EstateTypeDAOImpl;
import models.real_estate_models.EstateType;
import services.EntityService;

public class EstateTypeService extends EntityService<EstateType> {
    public EstateTypeService() {
        setImpl(new EstateTypeDAOImpl());
    }
}
