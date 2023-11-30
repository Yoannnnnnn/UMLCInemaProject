package fr.efrei.repository;


import fr.efrei.domain.Movie;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

//SINGLETON PART
public class SubjectRepository implements IMovieRepository {

    private static SubjectRepository repository=null;
    private List<Movie> movieDB=null;
    private SubjectRepository(){
        movieDB = new ArrayList<Movie>();
    }
    public static SubjectRepository getRepository(){
        if (repository==null)
            repository = new SubjectRepository();
        return repository;
    }
    public Movie createMovie (Movie movie){
        boolean success = movieDB.add(movie);
        if (success)
            return movie;
        else
            return null;
    }
    public Movie read (String movieCode) {
        /*for (Movie movie : movieDB){
            if (movie.getMovieCode().equals(movieCode){
                return movie;
            }
        }
        return null; */
        Movie movie = movieDB.stream()
                .filter(s -> s.getTitle().equals(movieCode))
                .findAny()
                .orElse(null);
        return movie;
    }
    public Movie update(Movie newMovie){
        Movie OldMovie = read(newMovie.getTitle());
        if (OldMovie == null)
            return null;
        boolean success = delete(newMovie.getTitle());
        if (success){
            boolean successAdded = movieDB.add(newMovie);
            if (successAdded)
                return newMovie;
            else
                return null;
        }
        return null;
    }
    public boolean delete(String movieCode){
        Movie movieToDelete = read(movieCode);
        boolean success = movieDB.remove(movieToDelete);
        return success;
    }
    public List<Movie> getAll(){
        return movieDB;
    }
}
