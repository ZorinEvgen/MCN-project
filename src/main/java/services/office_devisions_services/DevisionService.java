package services.office_devisions_services;

import dao.office_devisions_daos.DevisionDAOImpl;
import models.office_devisions_models.Devision;
import services.EntityService;

public class DevisionService extends EntityService<Devision> {
    public DevisionService() {
        setImpl(new DevisionDAOImpl());
    }
}
