package services.errand_services;

import dao.errand_daos.InspectionDAOImpl;
import models.errand_models.Inspection;
import services.EntityService;

public class InspectionService extends EntityService<Inspection> {
    public InspectionService() {
        setImpl(new InspectionDAOImpl());
    }
}
