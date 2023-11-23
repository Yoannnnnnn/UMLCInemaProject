package fr.efrei.domain;

public class Seat {
    private int seat_number;

    private Seat() {
    }

    private Seat(Builder builder) {
        this.seat_number = builder.seat_number;
    }

    public int getSeat_number() {
        return seat_number;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seat_number=" + seat_number +
                '}';
    }
    public static class Builder{
        private int seat_number;

        public Builder setSeat_number(int seat_number) {
            this.seat_number = seat_number;
            return this;
        }
        public Seat build(){
            return new Seat (this);
        }
    }
}
