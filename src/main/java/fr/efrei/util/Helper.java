package fr.efrei.util;

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


}
