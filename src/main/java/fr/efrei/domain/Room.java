package fr.efrei.domain;

import java.util.Arrays;

public class Room {
    private String [][] tab_seat;
    private Movie movie;

    private Room() {
    }

    private Room (Builder builder){
        this.tab_seat = builder.tab_seat;
        this.movie = builder.movie;
    }

    public String[][] getTab_seat() {
        return tab_seat;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", tab_seat=" + Arrays.toString(tab_seat) +
                ", movie=" + movie +
                '}';
    }

    public static class Builder{
        private String [][] tab_seat;
        private Movie movie;

        public Builder setTab_seat(String[][] tab_seat) {
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