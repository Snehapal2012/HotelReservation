package com.hotelreservation;

import java.util.Scanner;

public class UC1_AddHotel {
    public boolean hotelName(){
        String name="Lakewood";
        String name1="Bridgewood";
        String name2="Ridgewood";
        String userInput;
        System.out.print("Enter hotel name: ");
        Scanner scan=new Scanner(System.in);
        userInput=scan.next();
        if(userInput==name || userInput==name1 || userInput==name2)
           return true;
        else
            return false;
    }
    public void ratesForRegularCustomerForWeekdays() {
        int valueForLakewood = 110;
        int valueForBridgewood = 160;
        int valueForRidgewood = 220;
        int userInputForRates;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values to get to see the rates:" +
                "1->Lakewood" +
                "2->Bridgewood" +
                "3->Ridgewood");
        userInputForRates = scan.nextInt();
        if (userInputForRates == 1) {
            System.out.println("Rate: " + valueForLakewood);
        } else if (userInputForRates == 2) {
            System.out.println("Rate: " + valueForBridgewood);
        } else if (userInputForRates == 3) {
            System.out.println("Rate: " + valueForRidgewood);
        } else System.out.println("Invalid input!");

    }

    public static void main(String[] args) {
        System.out.println("------------Welcome to Hotel Reservation System---------------");
        UC1_AddHotel hotel=new UC1_AddHotel();
        hotel.hotelName();
        hotel.ratesForRegularCustomerForWeekdays();
    }
}
