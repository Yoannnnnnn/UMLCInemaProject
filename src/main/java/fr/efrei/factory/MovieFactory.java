package fr.efrei.factory;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;

public class MovieFactory {
    public static Movie createMovie(String title, String description, int age_restriction, int runningTime, int scheduled, int ticketPrice) {
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description))
            return null;

        if (Helper.isNullOrZero(age_restriction) || Helper.isNullOrZero(runningTime) || Helper.isNullOrZero(scheduled) || Helper.isNullOrZero(ticketPrice))
            return null;

        return new Movie.Builder()
                .setTitle(title)
                .setDescription(description)
                .setAge_restriction(age_restriction)
                .setRunningTime(runningTime)
                .setSchedule(scheduled)
                .setTicketPrice(ticketPrice)
                .build();
    }
}

