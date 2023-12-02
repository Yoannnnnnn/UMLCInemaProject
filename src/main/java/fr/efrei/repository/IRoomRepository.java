package fr.efrei.repository;

import fr.efrei.domain.Room;
import fr.efrei.domain.Movie;

import java.util.List;

public interface IRoomRepository extends IRepository< Integer, String> {
    boolean checkAvailability(int row, int column);

}