package services;

public interface DatabaseEntityService<DatabaseEntity>{
    DatabaseEntity findById(int id);

    public void save(DatabaseEntity databaseEntity);

    public void update(DatabaseEntity databaseEntity);

    public void delete(DatabaseEntity databaseEntity);
}
