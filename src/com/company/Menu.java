
package com.company;

import java.util.*;
import java.time.*;

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
        System.out.println("ADD TRIP");
        System.out.println("Is the trip international\n1:\tYes\n2:\tNo");
        int international= checkInt();
        System.out.println("Destination:");
        String destination = scanner.nextLine();
        System.out.println("Year departure:");
        int yearD = checkInt();
        System.out.println("Month departure:");
        int monthD = checkInt();
        System.out.println("Day departure:");
        int dayD = checkInt();
        System.out.println("Hour departure:");
        int hourD = checkInt();
        System.out.println("Minute departure:");
        int minuteD = checkInt();
        System.out.println("Year arrival:");
        int yearA = checkInt();
        System.out.println("Month arrival:");
        int monthA = checkInt();
        System.out.println("Day arrival:");
        int dayA = checkInt();
        System.out.println("Hour arrival:");
        int hourA = checkInt();
        System.out.println("Minute arrival:");
        int minuteA = checkInt();

        Platform platform =getAFreePlatform(LocalDateTime.of(yearD,monthD,dayD,hourD,minuteD));



        if(international==1){

        }

    }

    private void listDepartures(){

    }

    private void listArrivals(){

    }

    private Platform getAFreePlatform(LocalDateTime dateD, boolean isInternational){
        List<Platform> platformList = busTerminal.freePlatforms(dateD);
        for (Platform platform: platformList) {
            if(platform.isSmall() != isInternational){

            }

        }
        return platformList.get(0);
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

        LocalDateTime barcelonaArrival = LocalDateTime.of(2019, 12, 30, 10, 00);
        LocalDateTime berlinArrival = LocalDateTime.of(2020, 1, 2, 15, 00);
        LocalDateTime baselArrival = LocalDateTime.of(2020, 3, 15, 10, 00);
        LocalDateTime bernArrival = LocalDateTime.of(2020, 5, 30, 10, 00);
        LocalDateTime barcelonaDeparture = LocalDateTime.of(2019, 1, 2, 4, 00);
        LocalDateTime berlinDeparture = LocalDateTime.of(2020, 12, 30, 10, 00);
        LocalDateTime baselDeparture = LocalDateTime.of(2020, 3, 15, 8, 00);
        LocalDateTime bernDeparture = LocalDateTime.of(2020, 5, 30, 8, 00);

        InternationBus barcelona = new InternationBus(120);
        InternationBus berlin = new InternationBus(150);
        Bus basel = new Bus(40);
        Bus bern = new Bus(50);

        Travel barcelonaTravel= new Travel("barcelona", barcelonaArrival, barcelonaDeparture, true, barcelona );
        Travel berlinTravel= new Travel("berlin",berlinArrival, berlinDeparture, true, barcelona);
        Travel baselTravel= new Travel("basel",baselArrival, baselDeparture, true, basel);
        Travel bernTravel= new Travel("bern",bernArrival, bernDeparture, true, bern);

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
