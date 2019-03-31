package services.real_estate_services;

import dao.real_estate_daos.FederalEntitiesDAOImpl;
import models.real_estate_models.FederalEntity;
import services.DatabaseEntityService;

public class FederalEntityService implements DatabaseEntityService<FederalEntity> {
    private FederalEntitiesDAOImpl impl = new FederalEntitiesDAOImpl();

    public FederalEntity findById(int id){
        return impl.findById(id);
    }

    public void save(FederalEntity federalEntity){
        impl.save(federalEntity);
    }

    public void update(FederalEntity federalEntity){
        impl.update(federalEntity);
    }

    public void delete(FederalEntity federalEntity){
        impl.delete(federalEntity);
    }
}
