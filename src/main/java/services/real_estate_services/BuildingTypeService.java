package services.real_estate_services;


import dao.real_estate_daos.BuildingTypeDAOImpl;
import models.real_estate_models.BuildingType;
import services.EntityService;

public class BuildingTypeService extends EntityService<BuildingType> {

    public BuildingTypeService() {
        setImpl(new BuildingTypeDAOImpl());
    }
}
