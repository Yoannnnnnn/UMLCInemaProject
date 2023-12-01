package fr.efrei.views;

import fr.efrei.repository.MovieRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    }
