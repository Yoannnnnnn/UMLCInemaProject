package fr.efrei.repository;


import fr.efrei.domain.Movie;
import fr.efrei.domain.Room;

import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static RoomRepository repository = null;
    private Room[][] seatDB = null;
    final int numRows = 20;
    final int numColumns = 10;

    private RoomRepository() {
        seatDB = new Room[numRows][numColumns];
        // Initialize rooms and seats if needed
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
    public void read(String[][] seatArray) {
        if (seatArray == null) {
            System.out.println("Seat array is null.");
            return;
        }

        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                String seatStatus = seatArray[i][j];
                String seatLabel = getSeatLabel(i, j);
                System.out.print(seatLabel + ": " + seatStatus + "\t");
            }
            System.out.println();
        }
    }

    private String getSeatLabel(int row, int column) {
        char rowLabel = (char) ('A' + row);
        int columnNumber = column + 1;
        return rowLabel + Integer.toString(columnNumber);
    }


    @Override
    public Integer update(Integer existingEntity, Integer integer) {
        return null;
    }

    @Override
    public Movie update(Movie updatedMovie) {
        return null;
    }


    @Override
    public boolean delete(String title) {
        return false;
    }

    @Override
    public Integer create(Integer integer) {
        return null;
    }

    @Override
    public Integer read(String movie) {
        return null;
    }
}