package fr.efrei.repository;

public interface IRepository<T, String> {
    public T create(T t);
    public T read(String movie);
    public void read(String[][] seatArray);
    public T update(T t);
    boolean delete(String title);
}