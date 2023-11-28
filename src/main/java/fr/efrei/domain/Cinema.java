package fr.efrei.domain;
import java.util.List;
public class Cinema {
    private String cinema_name;
    private List <Room> roomlist;

    private Cinema (){

    }

    private Cinema (Builder builder){
        this.cinema_name = builder.cinema_name;
        this.roomlist = builder.roomlist;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public List<Room> getRoomlist() {
        return roomlist;
    }

    public static class Builder{
        private String cinema_name;
        private List <Room> roomlist;

        public Builder(String cinema_name, List<Room> roomlist){
            this.cinema_name = cinema_name;
            this.roomlist = roomlist;
        }

        public Builder(){

        }

        public Builder setCinema_name(String cinema_name) {
            this.cinema_name = cinema_name;
            return this;
        }

        public Builder setRoomlist(List<Room> roomlist) {
            this.roomlist = roomlist;
            return this;
        }

        public Cinema build(){
            return new Cinema (this);
        }
    }
}
