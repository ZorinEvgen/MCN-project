package services;

import dao.BuildingTypeDAOImpl;
import models.BuildingType;

public class BuildingTypeService implements DatabaseEntityService<BuildingType> {
    private BuildingTypeDAOImpl impl = new BuildingTypeDAOImpl();

    public BuildingType findById(int id){
        return impl.findById(id);
    }

    public void save(BuildingType buildingType){
        impl.save(buildingType);
    }

    public void update(BuildingType buildingType){
        impl.update(buildingType);
    }

    public void delete(BuildingType buildingType){
        impl.delete(buildingType);
    }

}
