package fr.efrei.domain;

import java.util.Arrays;

public class Room {
    private int room_number;
    private int [][] tab_seat;
    private Movie movie;

    private Room() {
    }
    private Room (Builder builder){
        this.room_number = builder.room_number;
        this.tab_seat = builder.tab_seat;
        this.movie = builder.movie;
    }

    public int getRoom_number() {
        return room_number;
    }
    public int[][] getTab_seat() {
        return tab_seat;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_number=" + room_number +
                ", tab_seat=" + Arrays.toString(tab_seat) +
                ", movie=" + movie +
                '}';
    }

    public static class Builder{
        private int room_number;
        private int [][] tab_seat;
        private Movie movie;

        public Builder setRoom_number(int room_number) {
            this.room_number = room_number;
            return this;
        }

        public Builder setTab_seat(int[][] tab_seat) {
            this.tab_seat = tab_seat;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }

        public Room build(){
            return new Room (this);
        }

    }
}