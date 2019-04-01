package services.real_estate_services;


import dao.real_estate_daos.DistrictsDAOImpl;
import models.real_estate_models.District;
import services.EntityService;

public class DistrictService extends EntityService<District> {

    public DistrictService() {
        setImpl(new DistrictsDAOImpl());
    }
}
