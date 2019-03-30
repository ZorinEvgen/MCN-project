package services;

import dao.FederalEntitiesDAIImpl;
import models.FederalEntity;

public class FederalEntityService implements DatabaseService<FederalEntity>{
    private FederalEntitiesDAIImpl impl = new FederalEntitiesDAIImpl();

    public FederalEntity findById(int id){
        return impl.findById(id);
    }

    public void saveFederalEntity(FederalEntity federalEntity){
        impl.save(federalEntity);
    }

    public void updateFederalEntity(FederalEntity federalEntity){
        impl.update(federalEntity);
    }

    public void deleteFederalEntity(FederalEntity federalEntity){
        impl.delete(federalEntity);
    }
}
