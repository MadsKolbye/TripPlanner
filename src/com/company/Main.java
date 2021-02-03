package com.company;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Trip> trips = new ArrayList<>();
	    menu(console, trips);
        printArray(trips);
        String s = "HEJ".toLowerCase();


    }
    public static void menu(Scanner console, ArrayList<Trip> trips){
        System.out.println("Press 1 to make a trip, press 2 to get a list of trips, press 0 to exit the program".toUpperCase());
        int choice = 1;
        while (choice != 0){
            choice = console.nextInt();
            //metode
            switch (choice) {
                case 1 -> {
                    System.out.println("You have chosen to create a trip");
                    newTrip(console, trips);
                }
                case 2 -> System.out.println("You have chosen to get a list of trips!");
                case 0 -> System.out.println("You have chosen to exit program");
                default -> System.out.println("Wrong choice");
            }
        }
    }
    public static void newTrip(Scanner console, ArrayList<Trip> trips){
        System.out.println("Select country:");
        String c = console.next();

        System.out.println("Select language:");
        String l = console.next();

        System.out.println("Type duration in days:");
        int d = console.nextInt();

        System.out.println("Select the amount of people who will be travelling");
        int a = console.nextInt();

        Trip t1 = new Trip(c, l, d, a);
        trips.add(t1);

    }

    public static void printArray(ArrayList<Trip> trips){
        for(int i = 0; i < trips.size(); i++){
            System.out.print(trips.get(i));

        }
    }
}
