package services.errand_services;

import dao.errand_daos.StatusDAOImpl;
import models.errand_models.Status;
import services.EntityService;

public class StatusService extends EntityService<Status> {
    public StatusService() {
        setImpl(new StatusDAOImpl());
    }
}
