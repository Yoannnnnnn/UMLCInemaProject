package fr.efrei.factory;
import fr.efrei.domain.Room;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;

public class RoomFactory {
    public static Room createRoom(int room_number, int[][] tab_seat, Movie movie ) {
        if (Helper.isNullOrZero(room_number)) {
            return null;
        }
        if (Helper.isTabNullOrZero(tab_seat)) {
            return null;
        }
        if(Helper.isMovieNull(movie)){
            return null;
        }
        return new Room.Builder()
                .setRoom_number(room_number)
                .setTab_seat(tab_seat)
                .setMovie(movie)
                .build();
    }
}