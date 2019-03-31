package services.real_estate_services;

import dao.real_estate_daos.BuildingTypeDAOImpl;
import models.real_estate_models.BuildingType;
import services.DatabaseEntityService;

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
