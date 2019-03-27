package services;

import dao.DistrictsDAOImpl;
import models.District;

public class DistrictService {
    private DistrictsDAOImpl impl = new DistrictsDAOImpl();

    public District findById(int id){
        return impl.findById(id);
    }

    public void saveFederalEntity(District district){
        impl.save(district);
    }

    public void updateFederalEntity(District district){
        impl.update(district);
    }

    public void deleteFederalEntity(District district){
        impl.delete(district);
    }
}
