package dao.interfaces;

import models.FederalEntity;

public interface FederalEntitiesDAO extends EntityDAO<FederalEntity>{

    FederalEntity findById(int id);

    void save(FederalEntity federalEntity);

    void update(FederalEntity federalEntity);

    void delete(FederalEntity federalEntity);

}
