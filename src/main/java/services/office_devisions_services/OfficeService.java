package services.office_devisions_services;

import dao.office_devisions_daos.OfficeDAOImpl;
import models.office_devisions_models.Office;
import services.EntityService;

public class OfficeService extends EntityService<Office> {
    public OfficeService() {
        setImpl(new OfficeDAOImpl());
    }
}
