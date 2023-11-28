package fr.efrei.factory;

import fr.efrei.domain.Cinema;
import fr.efrei.util.Helper;
import fr.efrei.domain.Room;
import java.util.List;

public class CinemaFactory {
    public static Cinema createCinema(String cinema_name) {
        if (Helper.isNullOrEmpty(cinema_name))
            return null;

        return new Cinema.Builder()
                .setCinema_name(cinema_name)
                .build();
    }

    public static Cinema createCinema(List <Room> roomList){
        if(roomList.isEmpty())
            return null;

        return new Cinema.Builder()
                .setRoomlist(roomList)
                .build();
    }
}
