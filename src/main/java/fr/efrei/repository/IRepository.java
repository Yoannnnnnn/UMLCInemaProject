package fr.efrei.repository;

import fr.efrei.domain.Movie;

public interface IRepository<T, String> {
    public T create(T t);
    public T read(String movie);
    public void read(String[][] seatArray);
    T update(T existingEntity, T updatedEntity);
    Movie update(Movie updatedMovie);
    boolean delete(String title);
}