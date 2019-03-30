package services;

public interface DatabaseService <DatabaseEntity>{
    DatabaseEntity findById(int id);
}
