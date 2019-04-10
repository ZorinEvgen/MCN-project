package services.errand_services;



import dao.errand_daos.ErrandDAOImpl;
import models.errand_models.Errand;
import services.EntityService;

public class ErrandService extends EntityService<Errand> {
    public ErrandService() {
        setImpl(new ErrandDAOImpl());
    }
}
