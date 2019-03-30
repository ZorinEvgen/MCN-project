package services;

import dao.DistrictsDAOImpl;
import models.District;

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
