package fr.efrei.factory;
import fr.efrei.domain.Room;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;


public class RoomFactory {
    public static Room create(int room_number, String[][] tab_seat, Movie movie ) {
        if (Helper.isNullOrZero(room_number)) {
            return null;
        }
        if (Helper.isTabNullOrEmpty(tab_seat)) {
            return null;
        }
        if(Helper.isMovieNull(movie)){
            return null;
        }
        return new Room.Builder()
                .setTab_seat(tab_seat)
                .setMovie(movie)
                .build();
    }
}