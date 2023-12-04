package fr.efrei.repository;

import fr.efrei.domain.Movie;

import java.util.List;
import java.util.ArrayList;

public class MovieRepository implements IMovieRepository {
    private static MovieRepository repository = null;
    private List<Movie> movieDB = null;

    private MovieRepository() {
        movieDB = new ArrayList<>();
    }

    public static MovieRepository getRepository() {
        if (repository == null) {
            repository = new MovieRepository();
        }
        return repository;
    }

    @Override
    public Movie create(Movie movie) {
        // Add the movie if the repository is empty
        if (movieDB.isEmpty()) {
            movieDB.add(movie);
            System.out.println("Movie added successfully!");
        } else {
            // Search for a movie with the same release date
            boolean found = false;
            for (int i = 0; i < movieDB.size(); i++) {
                if (movieDB.get(i).getReleaseDate().equals(movie.getReleaseDate())) {
                    // Replace the existing movie with the new one
                    movieDB.set(i, movie);
                    found = true;
                    System.out.println("Movie updated successfully!");
                    break;
                }
            }

            // If no movie with the same release date is found, add the new movie
            if (!found) {
                movieDB.add(movie);
                System.out.println("Movie added successfully!");
            }
        }

        // Return the created or updated movie
        return movie;
    }



    @Override
    public Movie read(String title) {
        for (Movie movie : movieDB) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    @Override
    public void read(String[][] seatArray) {

    }

    @Override
    public Movie update(Movie existingEntity, Movie updatedEntity) {
        return null;
    }

    @Override
    public Movie update(Movie updatedMovie) {
        Movie existingMovie = read(updatedMovie.getTitle());

        if (existingMovie != null) {
            // Remove the existing movie from the list
            movieDB.remove(existingMovie);

            // Add the updated movie to the list
            boolean successAdded = movieDB.add(updatedMovie);

            if (successAdded) {
                return updatedMovie;
            } else {
                // If adding the updated movie fails, re-add the existing movie
                movieDB.add(existingMovie);
            }
        }

        return null;
    }

    @Override
    public boolean delete(String title) {
        Movie movieToDelete = read(title);
        return movieToDelete != null && movieDB.remove(movieToDelete);
    }

    @Override
    public List<Movie> getAll() {
        return new ArrayList<>(movieDB);
    }

    @Override
    public boolean deleteByTitle(String title) {
        Movie movieToDelete = read(title);

        if (movieToDelete != null) {
            return movieDB.remove(movieToDelete);
        }

        return false;
    }

    public Movie getMovieByTitle(String title) {
        for (Movie movie : movieDB) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByYear(int year) {
        List<Movie> moviesByYear = new ArrayList<>();

        for (Movie movie : movieDB) {
            int movieYear = Integer.parseInt(movie.getReleaseDate().substring(0, 4));

            if (movieYear == year) {
                moviesByYear.add(movie);
            }
        }

        return moviesByYear;
    }
}
