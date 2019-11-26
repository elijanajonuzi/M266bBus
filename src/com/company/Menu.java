
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Terminal busTerminal= new Terminal();
    public void menu() {
        busTerminal.setName("Zürich");
        busTerminal.setPlatforms(generateData());

        boolean remainInProgram = true;


        int chosenOption = 0;
        int index = 0;

        do {

            System.out.println("HELLO\nWhat do you want to do?\n"+
                    "________________\n\n" +
                    "[1]\tAdd Trip\n" +
                    "[2]\tList Departures\n" +
                    "[3]\tList Arrivals\n" +
                    "[0]\tStop program\n" +
                    "________________\n\n");

            try {
                chosenOption = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                chosenOption = 999;
            }
            scanner.nextLine();
            switch (chosenOption) {
                case 1:
                    addTrip();
                    break;
                case 2:
                    listDepartures();
                    break;
                case 3:
                    listArrivals();
                    break;
                case 0:
                    remainInProgram = false;
                    break;
                default:
                    System.out.println("This answer is not Valid");
                    break;
            }

        } while (remainInProgram);


    }

    private void addTrip() {

    }

    private void listDepartures(){

    }

    private void listArrivals(){

    }

    private void listGrades() {

    }


    private int checkInt() {
        int index = 0;
        do {
            index = 0;
            try {
                index = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("please give a valid number");
                System.out.println("try again:");
                index = 999;
                scanner.nextLine();
            }
        } while (index == 999);
        return index;
    }

    private double checkDouble() {
        double index = 0;
        do {
            index = 0;
            try {

                index = scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("please give a valid number");
                System.out.println("try again:");
                index = 999;
                scanner.nextLine();
            }

        } while (index == 999);
        return index;


    }

    private List<Platform> generateData(){
        InternationBus barcelona = new InternationBus(120, false);
        InternationBus berlin = new InternationBus(150, false);
        Bus basel = new Bus(40, true);
        Bus bern = new Bus(50, true);

        Travel barcelonaTravel= new Travel("barcelona","13:00", "02:00", true, barcelona );
        Travel berlinTravel= new Travel("berlin","20:00", "10:00", true, barcelona);
        Travel baselTravel= new Travel("basel","14:00", "12:00", true, basel);
        Travel bernTravel= new Travel("bern","15:00", "12:00", true, bern);

        Platform platform1 = new Platform(1, 100, "spain-bus", barcelonaTravel);
        Platform platform2 = new Platform(2,80,"german-bus", berlinTravel);
        Platform platform3 = new Platform(3, 50, "swiss", baselTravel);
        Platform platform4 = new Platform(4, 50, "swiss", bernTravel);
        Platform platform5 = new Platform(5, 100, false);
        Platform platform6 = new Platform(6, 50, true);

        List<Platform> platforms = new ArrayList<>();
        platforms.add(platform1);
        platforms.add(platform2);
        platforms.add(platform3);
        platforms.add(platform4);
        platforms.add(platform5);
        platforms.add(platform6);

        return platforms;

    }
}
