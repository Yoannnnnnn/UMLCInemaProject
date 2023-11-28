package fr.efrei.util;

public class Helper {

    public static boolean isNullOrEmpty(String s){
        return ((s==null) || (s.isEmpty()));
    }

    public static boolean isNullOrZero(Integer n){
        return ((n == null) || (n == 0));
    }


}
