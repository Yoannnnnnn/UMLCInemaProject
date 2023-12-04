package fr.efrei.repository;
import fr.efrei.domain.Room;

import fr.efrei.domain.Movie;
import java.util.List;
public interface IMovieRepository extends IRepository<Movie, String> {

    public List<Movie> getAll();
}