package fr.efrei.util;
import fr.efrei.domain.Movie;
import fr.efrei.domain.Room;
import fr.efrei.repository.RoomRepository;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        return ((s == null) || (s.isEmpty()));
    }

    public static boolean isNullOrZero(int n) {
        return n == 0;
    }

    public static boolean isTabNullOrEmpty(String[][] n) {
        return n == null;
    }

    public static boolean isMovieNull(Movie movie) {
        return movie == null;
    }

    public static boolean addValueTo2DArray(String[][] seatDB, int row, int column, String value) {
        if (row >= 0 && row < seatDB.length && column >= 0 && column < seatDB[0].length) {
            seatDB[row][column] = value;
            return true;

        } else {
            System.out.println("Invalid row or column indices.");
            return false;
        }

    }
}


