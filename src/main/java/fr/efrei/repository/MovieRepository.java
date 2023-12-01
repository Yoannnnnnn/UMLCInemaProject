package fr.efrei.repository;

import fr.efrei.domain.Movie;
import java.util.List;
import java.util.ArrayList;

public class MovieRepository implements IMovieRepository{
    private static MovieRepository repository = null;
    private List<Movie> movieDB = null;
    private MovieRepository(){movieDB = new ArrayList<Movie>();}
    public static MovieRepository getRepository(){
        if (repository == null){
            repository = new MovieRepository();
        }
        return repository;
    }

    @Override
    public Movie create (Movie movie){
        boolean success = movieDB.add(movie);
        if(success){
            return movie;
        }
        else {
            return null;
        }
    }

    @Override
    public Movie read (String title){
        for(Movie movie : movieDB){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie update (Movie newMovie){
        Movie OldMovie = read(newMovie.getTitle());
        if (OldMovie == null){
            boolean successAdded = movieDB.add(newMovie);
            if(successAdded){
                return newMovie;
            }
            else{
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String title){
        Movie movieToDelete = read(title);
        boolean success = movieDB.remove(movieToDelete);
        return success;
    }

    @Override
    public List <Movie> getAll(){
        return movieDB;
    }
}
