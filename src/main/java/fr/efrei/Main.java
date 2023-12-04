    package fr.efrei;


    import fr.efrei.domain.Movie;
    import fr.efrei.domain.Room;
    import fr.efrei.factory.RoomFactory;
    import fr.efrei.repository.MovieRepository;
    import fr.efrei.repository.RoomRepository;
    import fr.efrei.repository.IRoomRepository;
    import fr.efrei.views.MovieView;

    import java.util.*;

    import static fr.efrei.views.MovieView.*;

    public class Main {
        private static IRoomRepository roomRepository = RoomRepository.getRepository();
        private static Scanner scanner = new Scanner(System.in);
        private static Set<String> bookedSeats = new HashSet<>();

        private static void enterHomepage(){
            Scanner scanner = new Scanner(System.in);

            boolean exitRequested = false;

            while (!exitRequested) {
                System.out.println("Welcome to the cinema homepage!");
                System.out.println("1. Manage Movies");
                System.out.println("2. Book a Place");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Call a method to manage movies (e.g., MovieView)
                        MovieView.manageMovies();
                        break;
                    case 2:
                        // Continue with the existing booking logic
                        chooseMovie();
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        exitRequested = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }

            // Close the scanner before exiting the method
            scanner.close();
        }

        public static void initializeMovies() {
            Movie movie1 = new Movie.Builder()
                .setTitle("Babylon")
                .setAge_restriction(14)
                .setRunningTime(189)
                .setReleaseDate("2023-01-18")
                .setTicketPrice2D(5)
                .setTicketPrice3D(8)
                .setDescription("Los Angeles in the 1920s. A tale of overweening ambition and madcap excess, BABYLON traces the rise and fall of various characters during the creation of Hollywood, an era of decadence and the rise and fall of a new generation of filmmakers.")
                .build();

            Movie movie2 = new Movie.Builder()
                    .setTitle("AntMan_Quantumania")
                    .setAge_restriction(12)
                    .setRunningTime(121)
                    .setReleaseDate("2023-02-15")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("A new adventure awaits Scott Lang and Hope van Dyne in their life as a couple and as superheroes!")
                    .build();

            Movie movie3 = new Movie.Builder()
                    .setTitle("SCREAM_VI")
                    .setAge_restriction(12)
                    .setRunningTime(123)
                    .setReleaseDate("2023-03-08")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("In this sixth opus, the survivors of the Ghostface murders leave Woodsboro to begin a new chapter in their lives in New York.")
                    .build();

            Movie movie4 = new Movie.Builder()
                    .setTitle("Super_Mario_Bros")
                    .setAge_restriction(0)
                    .setRunningTime(92)
                    .setReleaseDate("2023-04-05")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("While trying to repair an underground pipe, Mario and his brother Luigi, both plumbers, find themselves plunged into a new fairytale world through a mysterious conduit.")
                    .build();

            Movie movie5 = new Movie.Builder()
                    .setTitle("Guardians_of_the_Galaxy_3")
                    .setAge_restriction(10)
                    .setRunningTime(150)
                    .setReleaseDate("2023-05-03")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("Our favorite band of misfits has changed somewhat. Peter Quill, still mourning the loss of Gamora, must rally his team to defend the universe and protect one of his own.")
                    .build();

            Movie movie6 = new Movie.Builder()
                    .setTitle("Elementary")
                    .setAge_restriction(0)
                    .setRunningTime(102)
                    .setReleaseDate("2023-06-21")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("In Element City, fire, water, earth and air live in perfect harmony. This is the home of Flam, an intrepid, quick-witted young woman with a strong character.")
                    .build();

            Movie movie7 = new Movie.Builder()
                    .setTitle("Barbie")
                    .setAge_restriction(0)
                    .setRunningTime(115)
                    .setReleaseDate("2023-07-19")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("In Barbie Land, you're a perfect being in a perfect world. Unless you're having an existential crisis, or you're Ken.")
                    .build();

            Movie movie8 = new Movie.Builder()
                    .setTitle("Equalizer_3")
                    .setAge_restriction(12)
                    .setRunningTime(110)
                    .setReleaseDate("2023-08-30")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("Since renouncing his life as a government assassin, Robert McCall struggles to make peace with his past demons and finds strange solace in defending the oppressed.")
                    .build();

            Movie movie9 = new Movie.Builder()
                    .setTitle("Reptile")
                    .setAge_restriction(12)
                    .setRunningTime(134)
                    .setReleaseDate("2023-09-29")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("A murder mystery. A hardened policeman. A truth so dangerous it boggles the mind.")
                    .build();

            Movie movie10 = new Movie.Builder()
                    .setTitle("Killers_of_the_Flower_Moon")
                    .setAge_restriction(12)
                    .setRunningTime(208)
                    .setReleaseDate("2023-10-18")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("At the beginning of the 20th century, oil brought fortune to the Osage people, who overnight became one of the richest in the world. The wealth of these Amerindians immediately attracted the covetous.")
                    .build();

            Movie movie11 = new Movie.Builder()
                    .setTitle("Hunger_Games")
                    .setAge_restriction(12)
                    .setRunningTime(158)
                    .setReleaseDate("2023-11-15")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("Young Coriolanus is the last hope of his lineage; the once proud and wealthy Snow family has fallen from grace in a post-war Capitol. In the run-up to the 10th HUNGER GAMES.")
                    .build();

            Movie movie12 = new Movie.Builder()
                    .setTitle("Wonka")
                    .setAge_restriction(12)
                    .setRunningTime(107)
                    .setReleaseDate("2023-12-13")
                    .setTicketPrice2D(5)
                    .setTicketPrice3D(8)
                    .setDescription("Discover the youth of Willy Wonka, the extraordinary inventor, magician and chocolatier from the magical world of Roald Dahl's Charlie and the Chocolate Factory, in the film WONKA.")
                    .build();


            // Add each movie to the repository
            MovieRepository.getRepository().create(movie1);
            MovieRepository.getRepository().create(movie2);
            MovieRepository.getRepository().create(movie3);
            MovieRepository.getRepository().create(movie4);
            MovieRepository.getRepository().create(movie5);
            MovieRepository.getRepository().create(movie6);
            MovieRepository.getRepository().create(movie7);
            MovieRepository.getRepository().create(movie8);
            MovieRepository.getRepository().create(movie9);
            MovieRepository.getRepository().create(movie10);
            MovieRepository.getRepository().create(movie11);
            MovieRepository.getRepository().create(movie12);

            // Iterate through each movie to create a room, randomly book initial seats, and add the movie to the repository
            for (Movie movie : Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12)) {
                // Create a room using the factory method
                Room room = RoomFactory.create(1, generateEmptySeats(), movie);

                // Randomly book a few places
                randomBooking(room);

                // Display the initial state of the room
                displayRoom(room);

                // Add the movie to the repository
                MovieRepository.getRepository().create(movie);
            }
        }



        private static void randomBooking(Room room) {
            int numRows = room.getTab_seat().length;
            int numColumns = room.getTab_seat()[0].length;

            // Define the number of initial booked seats (you can adjust this as needed)
            int numInitialBookedSeats = 5;

            for (int i = 0; i < numInitialBookedSeats; i++) {
                // Randomly select a seat until finding an available one
                while (true) {
                    int row = new Random().nextInt(numRows);
                    int column = new Random().nextInt(numColumns);

                    if (room.getTab_seat()[row][column].equals("O")) {
                        // Book the seat if it's available
                        room.getTab_seat()[row][column] = "X";
                        break;
                    }
                }
            }
        }

        private static void choosePlace() {
            // Get the watcher's age from user input
            System.out.println("Enter your age:");
            int watcherAge = scanner.nextInt();

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

            // Check if the watcher's age is below the age restriction
            if (watcherAge < movie.getAge_restriction()) {
                System.out.println("Sorry, you are not allowed to watch this movie due to age restrictions.");
                enterHomepage(); // Exit to the homepage
                return; // End the method
            }
            else{
                System.out.println("Great! You meet the age requirement for this movie.");
            }

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

            // Display movie details after seat selection
            System.out.println("Movie Details:");
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Age Restriction: " + movie.getAge_restriction());
            System.out.println("Running Time: " + movie.getRunningTime() + " minutes");
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("Ticket Price (2D): $" + movie.getTicketPrice2D());
            System.out.println("Ticket Price (3D): $" + movie.getTicketPrice3D());
            System.out.println("Description: " + movie.getDescription());

            // Proceed with any additional logic after displaying movie details
            // ...

            // Enter the homepage after exiting the booking loop
            enterHomepage();
        }





        private static String[][] generateEmptySeats() {
            int numRows = 5;
            int numColumns = 10;
            String[][] seats = new String[numRows][numColumns];

            Random random = new Random();
            double bookingPercentage = 0.2; // Adjust this percentage as needed

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numColumns; j++) {
                    if (random.nextDouble() < bookingPercentage) {
                        seats[i][j] = "X"; // "X" represents a booked seat
                    } else {
                        seats[i][j] = "O"; // "O" represents an available seat
                    }
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
                // Extract row and column from the user's seat choice
                int row = seatChoice.charAt(0) - 'A';
                int column = Integer.parseInt(seatChoice.substring(1)) - 1;

                // Check if the seat has already been booked
                if (bookedSeats.contains(seatChoice)) {
                    System.out.println("Sorry, the seat " + seatChoice + " is already booked. Please choose another seat:");
                } else if (room.getTab_seat()[row][column].equals("O")) {
                    // Update the room with the user's choice
                    room.getTab_seat()[row][column] = "X"; // "X" represents a taken seat
                    bookedSeats.add(seatChoice);
                    System.out.println("Congratulations! You've successfully booked seat " + seatChoice);

                    // Display the ticket with the correct movie details
                    displayTicket(room.getMovie(), seatChoice);

                    // Exit the loop after successfully booking a seat
                    break;
                } else {
                    System.out.println("Sorry, the seat " + seatChoice + " is already taken. Please choose another seat:");
                }

                // Display the room status after each choice
                displayRoom(room);

                // Ask the user to choose seats in a loop
                System.out.println("Choose your seat (e.g., A1) or type 'exit' to finish booking:");
                seatChoice = scanner.next();
            }

            enterHomepage();
        }







        private static void chooseMovie() {
            Scanner scanner = new Scanner(System.in);

            // Display available movies with release date
            System.out.println("Available Movies:");
            List<Movie> movies = MovieRepository.getRepository().getAll();
            for (Movie movie : movies) {
                System.out.println(movie.getTitle() + " - Release Date: " + movie.getReleaseDate());
            }

            // Ask the user to choose a movie
            System.out.println("Enter the title of the movie you want to watch:");
            String chosenMovieTitle = scanner.next();

            // Retrieve the chosen movie from the repository
            Movie chosenMovie = MovieRepository.getRepository().getMovieByTitle(chosenMovieTitle);

            // Display details of the chosen movie
            if (chosenMovie != null) {
                System.out.println("Movie Details:");
                System.out.println("Title: " + chosenMovie.getTitle());
                System.out.println("Age Restriction: " + chosenMovie.getAge_restriction());
                System.out.println("Running Time: " + chosenMovie.getRunningTime() + " minutes");
                System.out.println("Release Date: " + chosenMovie.getReleaseDate());
                System.out.println("Ticket Price (2D): $" + chosenMovie.getTicketPrice2D());
                System.out.println("Ticket Price (3D): $" + chosenMovie.getTicketPrice3D());
                System.out.println("Description: " + chosenMovie.getDescription());

                // Proceed to choose a place (seat booking logic)
                choosePlace();

            } else {
                System.out.println("Invalid movie title. Please choose a valid movie.");
            }

            // Close the scanner before exiting the method
            scanner.close();
        }


        private static void displayTicket(Movie movie, String seatNumber) {
            System.out.println("*************** Ticket ***************");
            System.out.println("Movie Title: " + movie.getTitle());
            System.out.println("Date: " + movie.getReleaseDate()); // You may want to format the date
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: $" + movie.getTicketPrice2D()); // Assuming 2D ticket price for simplicity
            System.out.println("**************************************");
        }


        public static void manageMovies() {
            while (true) {
                System.out.println("Movie Management Menu:");
                System.out.println("1. Add Movie");
                System.out.println("2. Update Movie");
                System.out.println("3. Delete Movie");
                System.out.println("4. Return to Homepage");

                // Check if there's input available
                if (scanner.hasNextInt()) {
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
                } else {
                    // Handle the case when no integer is entered
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Consume the invalid input to avoid an infinite loop
                }
            }
        }



        public static void deleteMovie() {
            // Display available movies for the user to choose from
            listAllMovies();

            // Prompt the user for the title of the movie to delete
            System.out.println("Enter the title of the movie you want to delete:");
            String movieToDelete = scanner.next();

            // Remove the movie from the repository
            boolean deleted = MovieRepository.getRepository().deleteByTitle(movieToDelete);

            if (deleted) {
                System.out.println("Movie deleted successfully!");
            } else {
                System.out.println("Movie not found. Deletion failed.");
            }
        }


            public static void listAllMovies() {
                // Retrieve and display all movies from the repository
                List<Movie> movies = MovieRepository.getRepository().getAll();

                if (movies.isEmpty()) {
                    System.out.println("No movies available.");
                } else {
                    System.out.println("List of All Movies:");
                    for (Movie movie : movies) {
                        System.out.println("Title: " + movie.getTitle() + " - Release Date: " + movie.getReleaseDate());
                    }
                }
            }





        public static void main(String[] args) {

            initializeMovies();

            enterHomepage();
        }

    }