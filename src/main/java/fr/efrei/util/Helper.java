package fr.efrei.util;
import fr.efrei.domain.Movie;

public class Helper {

    public static boolean isNullOrEmpty(String s){
        return ((s==null) || (s.isEmpty()));
    }

    public static boolean isNullOrZero(int n){
        return  n == 0;
    }

    public static boolean isTabNullOrZero(int[][] n){
        return  n == null;
    }
     public static boolean isMovieNull(Movie movie){return movie==null;}


}
