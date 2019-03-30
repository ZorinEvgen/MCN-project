package services;

public interface DatabaseEntityService<DatabaseEntity>{
    DatabaseEntity findById(int id);

    void save(DatabaseEntity databaseEntity);

    void update(DatabaseEntity databaseEntity);

    void delete(DatabaseEntity databaseEntity);
}
