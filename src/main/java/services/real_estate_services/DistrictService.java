package services.real_estate_services;

import dao.real_estate_daos.DistrictsDAOImpl;
import models.real_estate_models.District;
import services.DatabaseEntityService;

public class DistrictService implements DatabaseEntityService<District> {
    private DistrictsDAOImpl impl = new DistrictsDAOImpl();

    public District findById(int id){
        return impl.findById(id);
    }

    public void save(District district){
        impl.save(district);
    }

    public void update(District district){
        impl.update(district);
    }

    public void delete(District district){
        impl.delete(district);
    }
}
