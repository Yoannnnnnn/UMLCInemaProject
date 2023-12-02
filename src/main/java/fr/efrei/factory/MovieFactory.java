package fr.efrei.factory;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;

public class MovieFactory {
    public static Movie createMovie(String title, String description, int age_restriction, int runningTime, String releaseDate, int ticketPrice2D, int ticketPrice3D) {
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(releaseDate))
            return null;

        if (Helper.isNullOrZero(age_restriction) || Helper.isNullOrZero(runningTime) || Helper.isNullOrZero(ticketPrice2D) || Helper.isNullOrZero(ticketPrice3D))
            return null;

        return new Movie.Builder()
                .setTitle(title)
                .setDescription(description)
                .setAge_restriction(age_restriction)
                .setRunningTime(runningTime)
                .setReleaseDate(releaseDate)
                .setTicketPrice2D(ticketPrice2D)
                .build();
    }
}

