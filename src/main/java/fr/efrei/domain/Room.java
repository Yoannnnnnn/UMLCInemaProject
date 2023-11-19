package fr.efrei.domain;

public class Room {
    private int room_number;

    private Room() {
    }

    private Room(RoomBuilder builder) {
        this.room_number = builder.room_number;
    }

    public int getRoom_number() {
        return room_number;
    }

    public static class RoomBuilder{
        private int room_number;

        public RoomBuilder(int room_number) {
            this.room_number = room_number;
        }

        public RoomBuilder setRoom_number(RoomBuilder builder) {
            this.room_number = builder.room_number;
            return this;
        }

        public Room build(){
            return new Room(this);
        }
    }
}
