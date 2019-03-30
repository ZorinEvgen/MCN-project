package dao;

import dao.interfaces.EntityDAO;

public interface EntityDAOImpl<Entity> extends EntityDAO<Entity> {
    Entity findById(int id);

    void save(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);
}
