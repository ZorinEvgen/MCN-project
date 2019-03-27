package dao.interfaces;

import models.District;

public interface DistrictsDAO extends EntityDAO<District> {

    District findById(int id);

    void save(District district);

    void update(District district);

    void delete(District district);
}
