package com.itacademy.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {

        // FAMILY 1
        Person son = new Person("Julius", "Iesmutis",Sex.MALE,16);
        Person daughter = new Person("Gabriele", "Iesmutyte",Sex.FEMALE,13);
        Person father = new Person("Zygimantas","Iesmutis",Sex.MALE,42);
        Person mother = new Person("Samanta", "Iesmutiene",Sex.FEMALE,45);
        Vehicle car = new Vehicle("Volkswagen","Touran",60.0,6.2);
        TravelDestination destination = new TravelDestination("Exploring Capital of Latvia",
                "Riga",320.0);

        Family family = new Family(new Person[]{son, daughter, father, mother},car,destination);

        // FAMILY 2


        Person daughter2 = new Person(" Jurate", "Kartanaite",Sex.FEMALE,18);
        Person father2 = new Person("Augustinas","Kartanys",Sex.MALE,40);
        Person mother2 = new Person("Simona", "Kartaniene",Sex.FEMALE,40);

        Vehicle car2 = new Vehicle("Fiat","Panda",6,4.1);
        TravelDestination destination2 = new TravelDestination("Exploring Heart of Lithuania",
                "Kaunas",100);
        Family family2 = new Family(new Person[]{daughter2, father2, mother2},car2,destination2);


        TravelDestination destination3 = new TravelDestination("Sunny time in Spain",
                "Barcelona",2877.0);

        TravelManager.changeDestination(family,destination3);
        TravelManager.changeDestination(family2,destination2);

        TravelManager.travel(family);
        TravelManager.travel(family2);

        TravelManager.printFamilyMembers(family);
        TravelManager.printFamilyMembers(family2);




    }
}
