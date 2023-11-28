package fr.efrei.domain;

import java.util.Arrays;

public class Room {
 private int room_number;
    private int [][] tab_seat;

    private Room() {
    }
    private Room (Builder builder){
        this.room_number= builder.room_number;
        this.tab_seat=builder.tab_seat;
    }

    public int getRoom_number() {
        return room_number;
    }
    public int[][] getTab_seat() {
        return tab_seat;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_number=" + room_number +
                ", tab_seat=" + Arrays.toString(tab_seat) +
                '}';
    }

    public static class Builder{
        private int room_number;
        private int [][] tab_seat;

        public Builder setRoom_number(int room_number, int [][] tab_seat) {
            this.room_number = room_number;
            this.tab_seat=tab_seat;
            return this;
        }
        public Room build(){
            return new Room (this);
        }

    }
}
