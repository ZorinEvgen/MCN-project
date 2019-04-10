package services;

import dao.interfaces.EntityDAOImpl;

public abstract class EntityService <DatabaseEntity> implements EntityDAOImpl<DatabaseEntity>{
    private EntityDAOImpl<DatabaseEntity> impl;



    private EntityDAOImpl<DatabaseEntity> getImpl() {
        return impl;
    }

    protected void setImpl(EntityDAOImpl<DatabaseEntity> impl) {
        this.impl = impl;
    }



    public DatabaseEntity findById(int id) {
        return getImpl().findById(id);
    }

    public void save(DatabaseEntity entity) {
        getImpl().save(entity);
    }

    public void update(DatabaseEntity entity) {
        getImpl().update(entity);
    }

    public void delete(DatabaseEntity entity) {
        getImpl().delete(entity);
    }
}
