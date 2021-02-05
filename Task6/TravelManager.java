package com.itacademy.java.oop.basics;

import java.text.DecimalFormat;

public final class TravelManager {

    public TravelManager() {
    }

    static DecimalFormat df2 = new DecimalFormat("#.##");

    public  static void changeDestination(Family family, TravelDestination destination) {
        if (family.getDestination().getName().equals(destination.getName())) {
            System.out.println("Destination haven't changed");
        } else {
            family.setDestination(destination);
            System.out.println("New travel destination is: "+destination.toString());
        }
    }

    public static void travel(Family family) {
        double oneKilometerConsumption = (family.getCar().getConsumption()) / 100; //0.041
        double maxDistance = ((family.getCar().getFuel()) * 100)/family.getCar().getConsumption();
        if (family.getDestination().getDistance() <= maxDistance) {
            System.out.println("Yaaay! Family is able to reach their destination!");
        } else {
            System.out.println("Unfortunately, family is not able to reach their destination..");
            double allFuelRequired = (family.getDestination().getDistance()*family.getCar().getConsumption())/100;
            double howMuchToBuy = allFuelRequired-family.getCar().getFuel();
            System.out.println("Family has to buy "+df2.format(howMuchToBuy)+" liters of fuel");
        }
    }

    public static void printFamilyMembers(Family family) {
        System.out.println("Members of family: ");
        for (int i = 0; i < family.getPerson().length; i++) {
            System.out.println(family.getPerson()[i]);
        }
        System.out.println("-------------");
    }

}
