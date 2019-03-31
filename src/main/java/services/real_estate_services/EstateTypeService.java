package services.real_estate_services;

import dao.real_estate_daos.EstateTypeDAOImpl;
import models.real_estate_models.EstateType;
import services.DatabaseEntityService;

public class EstateTypeService implements DatabaseEntityService<EstateType> {
    private EstateTypeDAOImpl impl = new EstateTypeDAOImpl();

    public EstateType findById(int id) {
        return impl.findById(id);
    }

    public void save(EstateType estateType) {
        impl.save(estateType);
    }

    public void update(EstateType estateType) {
        impl.update(estateType);
    }

    public void delete(EstateType estateType) {
        impl.delete(estateType);
    }
}
