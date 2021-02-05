package com.itacademy.java.oop.basics;

public class Family {

    private Person person[];
    private Vehicle car;
    private TravelDestination destination;

    public Family(Person[] person, Vehicle car, TravelDestination destination) {
        this.person = person;
        this.car = car;
        this.destination = destination;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public TravelDestination getDestination() {
        return destination;
    }

    public void setDestination(TravelDestination destination) {
        this.destination = destination;
    }
}
