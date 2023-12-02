package fr.efrei;


import fr.efrei.domain.Movie;
import fr.efrei.domain.Room;
import fr.efrei.factory.RoomFactory;
import fr.efrei.repository.RoomRepository;
import fr.efrei.repository.IRoomRepository;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static IRoomRepository roomRepository = RoomRepository.getRepository();
    private static Scanner scanner = new Scanner(System.in);
    private static Set<String> bookedSeats = new HashSet<>();

    public static void main(String[] args) {
        // Create a sample movie using the Movie.Builder
        Movie movie = new Movie.Builder()
                .setTitle("Inception")
                .setAge_restriction(12)
                .setRunningTime(150)
                .setReleaseDate("2023-01-01")
                .setTicketPrice2D(10)
                .setTicketPrice3D(15)
                .setDescription("A mind-bending thriller")
                .build();

        // Create a room using the factory method
        Room room = RoomFactory.create(1, generateEmptySeats(), movie);

        // Display the initial state of the room
        displayRoom(room);

        // Ask the user to choose seats in a loop
        while (true) {
            System.out.println("Choose your seat (e.g., A1) or type 'exit' to finish booking:");
            String seatChoice = scanner.next();

            if (seatChoice.equalsIgnoreCase("exit")) {
                break;
            } else {
                // Process the user's seat choice
                processSeatChoice(room, seatChoice);
            }
        }

        // Enter the homepage after exiting the booking loop
        enterHomepage();
    }

    private static String[][] generateEmptySeats() {
        int numRows = 5;
        int numColumns = 10;
        String[][] seats = new String[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                seats[i][j] = "O"; // "O" represents an available seat
            }
        }

        return seats;
    }

    private static void displayRoom(Room room) {
        System.out.println("Current Room Status:");
        roomRepository.read(room.getTab_seat());
    }

    private static void processSeatChoice(Room room, String seatChoice) {
        while (!seatChoice.equalsIgnoreCase("exit")) {
            // Check if the seat has already been booked
            if (bookedSeats.contains(seatChoice)) {
                System.out.println("Sorry, the seat " + seatChoice + " is already booked. Please choose another seat:");
            } else {
                // Extract row and column from the user's seat choice
                int row = seatChoice.charAt(0) - 'A';
                int column = Integer.parseInt(seatChoice.substring(1)) - 1;

                // Check if the seat is available using the repository's method
                if (roomRepository.checkAvailability(row, column)) {
                    // Update the room with the user's choice
                    room.getTab_seat()[row][column] = "X"; // "X" represents a taken seat
                    bookedSeats.add(seatChoice);
                    System.out.println("Congratulations! You've successfully booked seat " + seatChoice);

                    // Display the updated state of the room
                    displayRoom(room);
                } else {
                    System.out.println("Sorry, the seat " + seatChoice + " is already taken. Please choose another seat:");
                }
            }

            System.out.println("Choose your seat (e.g., A1) or type 'exit' to finish booking:");
            seatChoice = scanner.next();
        }

        System.out.println("Welcome to the cinema homepage!");
    }




    private static void enterHomepage() {
        System.out.println("Welcome to the cinema homepage!");
        // You can add more functionality or options for the homepage here
        // For example, options to view movies, book tickets for a different room, etc.
    }
}
