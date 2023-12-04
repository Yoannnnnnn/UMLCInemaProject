package fr.efrei.views;

import fr.efrei.domain.Movie;
import fr.efrei.repository.MovieRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static fr.efrei.Main.deleteMovie;
import static fr.efrei.Main.listAllMovies;

public class MovieView {



    public static void addMovie() {
        Scanner scanner = new Scanner(System.in);

        // Get movie details from the user
        System.out.println("Enter movie title: ");
        String title = scanner.nextLine();

        System.out.println("Enter age restriction: ");
        int ageRestriction = scanner.nextInt();

        System.out.println("Enter running time: ");
        int runningTime = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter release date (yyyy-MM-dd): ");
        String releaseDateInput = scanner.nextLine();
        LocalDate releaseDate = LocalDate.parse(releaseDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Enter description: ");
        String description = scanner.nextLine();

        System.out.println("Enter 2D ticket price: ");
        int ticketPrice2D = scanner.nextInt();

        System.out.println("Enter 3D ticket price: ");
        int ticketPrice3D = scanner.nextInt();

        // Check the current number of movies
        int currentNumberOfMovies = MovieRepository.getRepository().getAll().size();

        if (currentNumberOfMovies < 12) {
            // Proceed to add a new movie
            System.out.println("Adding a new movie...");

            // Create a new Movie object
            Movie newMovie = new Movie.Builder()
                    .setTitle(title)
                    .setAge_restriction(ageRestriction)
                    .setRunningTime(runningTime)
                    .setReleaseDate(releaseDateInput)
                    .setDescription(description)
                    .setTicketPrice2D(ticketPrice2D)
                    .setTicketPrice3D(ticketPrice3D)
                    .build();

            // Add the new movie to the repository
            MovieRepository.getRepository().create(newMovie);
            System.out.println("Movie added successfully!");
        } else {
            System.out.println("Sorry, you cannot add more movies. The maximum limit (12) has been reached.");
        }
    }




    private static Scanner scanner = new Scanner(System.in);
    public static void manageMovies() {

        while (true) {
            System.out.println("Movie Management Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. Update Movie");
            System.out.println("3. Delete Movie");
            System.out.println("4. Return to Homepage");


            int movieManagementChoice = scanner.nextInt();

            switch (movieManagementChoice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    updateMovie();
                    break;
                case 3:
                    deleteMovie();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void updateMovie() {
    }

    // Method to check if there are already 12 movies for the given year
    private static boolean isYearFull(int year) {
        // Assuming MovieRepository has a method to get movies by year
        List<Movie> moviesForYear = MovieRepository.getRepository().getMoviesByYear(year);

        return moviesForYear.size() >= 12;
    }



}