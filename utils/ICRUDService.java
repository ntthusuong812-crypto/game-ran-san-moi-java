package utils;

import java.util.List;

//<T>: Tính năng Generics giúp Interface này xài được cho nhiều loại Object khác nhau
public interface ICRUDService<T> {
    void addRecord(T item) throws GameException;       // Create
    List<T> readAllRecords() throws GameException;     // Read
    void updateRecord(int index, T item) throws GameException; // Update
    void deleteRecord(int index) throws GameException; // Delete
}