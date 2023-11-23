package fr.efrei.factory;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;
import fr.efrei.domain.Cinema;
import fr.efrei.domain.Person;
import fr.efrei.domain.Room;
import fr.efrei.domain.Movie;
import fr.efrei.domain.Ticket;

public class MovieFactory {
    public static Movie createMovie(String title, ...){
        if(Helper.isNullorEmpty(title) || Helper.isNullorEmpty(...an attribute))
            return null;

        if (... == null)
            return null;

        return new Movie.Builder().set...
                                  .set...
                                  .build();
    }

    public static Cinema createCinema(attribute...){
}

    public static Ticket createTicket(attribute){

    }
