package fr.efrei.factory;
import fr.efrei.domain.Room;
import fr.efrei.util.Helper;

public class RoomFactory {
    public static Room createRoom(int room_number) {
        if (Helper.isNullOrZero(room_number)) {
            return null;
        }
        return new Room.Builder()
                .setRoom_number(room_number)
                .build();
    }

    public static Room createRoom(int[][] tab_seat) {
        if (Helper.isTabNullOrZero(tab_seat)) {
            return null;
        }
        return new Room.Builder()
                .setTab_seat(tab_seat)
                .build();
    }
}