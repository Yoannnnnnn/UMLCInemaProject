package fr.efrei.factory;
import fr.efrei.domain.Movie;
import fr.efrei.util.Helper;

public class MovieFactory {
    public static Movie createMovie(String title) {
        if (Helper.isNullOrEmpty(title))
            return null;

        return new Movie.Builder()
                .setTitle(title)
                .build();
    }

    public static Movie createMovie(int age_restriction, int duration, int schedule) {
        if (Helper.isNullOrZero(age_restriction) || Helper.isNullOrZero(duration) || Helper.isNullOrZero(schedule))
            return null;

        return new Movie.Builder()
                .setAge_restriction(age_restriction)
                .setDuration(duration)
                .setSchedule(schedule)
                .build();
    }
}

