package services;

import dao.BuildingTypeDAOImpl;
import models.BuildingType;

public class BuildingTypeService {
    private BuildingTypeDAOImpl impl = new BuildingTypeDAOImpl();

    public BuildingType findById(int id){
        return impl.findById(id);
    }

    public void saveBuildingType(BuildingType buildingType){
        impl.save(buildingType);
    }

    public void updateBuildingType(BuildingType buildingType){
        impl.update(buildingType);
    }

    public void deleteBuildingType(BuildingType buildingType){
        impl.delete(buildingType);
    }

}
