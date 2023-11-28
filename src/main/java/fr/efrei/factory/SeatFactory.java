package fr.efrei.factory;
import fr.efrei.domain.Seat;
import fr.efrei.util.Helper;

public class SeatFactory {
    public static Seat createSeat(int seat_number) {
        if (Helper.isNullOrZero(seat_number)) {
            return null;
        }
        return new Seat.Builder()
                .setSeat_number(seat_number)
                .build();
    }
}
