package fr.efrei;

import java.util.Scanner;

public class Main {
    //Subject subject 1...;
    //Subject subject2 // DO NOT COPY THIS BUILDER PART OF KRUBEN !!!!!
    public static void addMovie(){
        Scanner sc = new Scanner(System.in);
        //get info
        System.out.println("Enter Movie information");
        System.out.println("Enter the title : ");
        String title = sc.nextLine();
        System.out.println("Enter the age of restriction : ");
        int age_restriction = sc.nextInt();
        System.out.println("Enter the running time : ");
        int running_time = sc.nextInt();
        System.out.println("Enter the time scheduled : ");
        int scheduled = sc.nextInt();
        System.out.println("Enter the price of the ticket : ");
        int price = sc.nextInt();
        System.out.println("Enter the description of the Movie : ");
        String description = sc.nextLine();
        //create subject object
        //add to the arrayList (repo)
    }
    public static void updateMovie(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Movie Menu"); // à redéfinir
            System.out.println("1. Add a movie");
            System.out.println("2. Search a movie");
            System.out.println("3. Update a movie");
            System.out.println("4. Delete a movie");
            System.out.println("5. See all movies");
            System.out.println("6. Exit");
            System.out.println("Enter a choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Which movie do you want to add?");
                    title = sc.next();
                    addMovie(title);
                    break;
                case 2:
                    updateMovie();
                    break;
            }
        } while (choice!=6);
    }

}
