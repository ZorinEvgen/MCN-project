package dao.interfaces;

import models.BuildingType;

public interface BuildingTypeDAO extends EntityDAO<BuildingType> {

    BuildingType findById(int id);

    void save(BuildingType buildingType);

    void update(BuildingType buildingType);

    void delete(BuildingType buildingType);
}
