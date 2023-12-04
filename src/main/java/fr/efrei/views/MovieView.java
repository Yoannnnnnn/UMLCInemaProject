package fr.efrei.views;

import fr.efrei.domain.Movie;
import fr.efrei.repository.MovieRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MovieView {

    public static void addMovie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie title: ");
        String title = sc.nextLine();

        System.out.println("Enter age restriction: ");
        int ageRestriction = sc.nextInt();

        System.out.println("Enter running time: ");
        int runningTime = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter release date (yyyy-MM-dd): ");
        String releaseDateInput = sc.nextLine();
        LocalDate releaseDate = LocalDate.parse(releaseDateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Enter description: ");
        String description = sc.nextLine();

        sc.close();
    }


    public static void deleteMovie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the title of the movie you want to delete: ");
        String titleToDelete = sc.nextLine();

        MovieRepository movieRepository = MovieRepository.getRepository();
        boolean deleted = movieRepository.delete(titleToDelete);

        if (deleted) {
            System.out.println("Movie deleted successfully.");
        } else {
            System.out.println("Movie not found or deletion failed.");
        }

        sc.close();
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

    private static void updateMovie() {
    }

    // Method to check if there are already 12 movies for the given year
    private static boolean isYearFull(int year) {
        // Assuming MovieRepository has a method to get movies by year
        List<Movie> moviesForYear = MovieRepository.getRepository().getMoviesByYear(year);

        return moviesForYear.size() >= 12;
    }



}