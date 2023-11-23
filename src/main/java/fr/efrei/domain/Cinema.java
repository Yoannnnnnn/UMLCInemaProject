package fr.efrei.domain;
import java.util.List;
public class Cinema {
    private String cinema_name;
    private List <Room> roomlist;

    private Cinema (){

    }

    private Cinema (CinemaBuilder builder){
        this.cinema_name = builder.cinema_name;
        this.roomlist = builder.roomlist;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public List<Room> getRoomlist() {
        return roomlist;
    }

    public static class CinemaBuilder{
        private String cinema_name;
        private List <Room> roomlist;

        public CinemaBuilder(String cinema_name, List<Room> roomlist){
            this.cinema_name = cinema_name;
            this.roomlist = roomlist;
        }

        public CinemaBuilder setCinema_name(CinemaBuilder builder) {
            this.cinema_name = builder.cinema_name;
            this.roomlist = builder.roomlist;
            return this;
        }

        public Cinema build(){
            return new Cinema (this);
        }
    }
}
