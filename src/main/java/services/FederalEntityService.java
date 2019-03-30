package services;

import dao.FederalEntitiesDAIImpl;
import models.FederalEntity;

public class FederalEntityService implements DatabaseEntityService<FederalEntity> {
    private FederalEntitiesDAIImpl impl = new FederalEntitiesDAIImpl();

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
