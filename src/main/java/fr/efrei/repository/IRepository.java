package fr.efrei.repository;

public interface IRepository <T, string>{
    public T create(T t);
    public T read(string movieCode);
    public T update(T t);

    public boolean delete(String seat_number);
}
