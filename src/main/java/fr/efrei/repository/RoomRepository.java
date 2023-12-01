package fr.efrei.repository;

import fr.efrei.domain.Room;
import fr.efrei.domain.Movie;

import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static RoomRepository repository = null;
    private String[][] seatDB = null;
    final int numRows = 20;
    final int numColumns = 10;

    private RoomRepository() {
        seatDB = new String[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                seatDB[i][j] = "Available";
            }
        }
    }

    public static RoomRepository getRepository() {
        if (repository == null) {
            repository = new RoomRepository();
        }
        return repository;
    }

    @Override
    public boolean checkAvailability(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return seatDB[row][column] == null;
        } else {
            return false;
        }
    }

    @Override
    public List<Movie> getAll() {
        // Implementation
        return null;
    }

    @Override
    public Room create(Room room) {
        return null;
    }

    @Override
    public Room read(Integer stuff) {
        return null;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public boolean delete(String stuff) {
        return false;
    }
}
