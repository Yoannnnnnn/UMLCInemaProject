package fr.efrei.domain;

public class Room {
 private int room_number;

    private Room() {
    }
    private Room (Builder builder){
        this.room_number= builder.room_number;
    }

    public int getRoom_number() {
        return room_number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_number=" + room_number +
                '}';
    }
    public static class Builder{
        private int room_number;

        public Builder setRoom_number(int room_number) {
            this.room_number = room_number;
            return this;
        }
        public Room build(){
            return new Room (this);
        }

    }
}
