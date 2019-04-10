package services.errand_services;

import dao.errand_daos.ErrandTypeDAOImpl;
import models.errand_models.ErrandType;
import services.EntityService;

public class ErrandTypeService extends EntityService<ErrandType> {
    public ErrandTypeService() {
        setImpl(new ErrandTypeDAOImpl());
    }
}
