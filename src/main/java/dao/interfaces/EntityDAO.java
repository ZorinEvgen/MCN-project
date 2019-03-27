package dao.interfaces;

public interface EntityDAO<Entity> {

    Entity findById(int id);

    void save(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);
}
