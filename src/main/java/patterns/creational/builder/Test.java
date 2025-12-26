package main.java.patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n:::::::::::::::::::::::::: Builder Design Pattern ::::::::::::::::::::::::::");
        House luxuryHouse = new House.Builder()
                .setRooms(6)
                .setBathrooms(4)
                .setFloors(2)
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarden(true)
                .setBasement(true)
                .setRoofType("Sloped Roof")
                .setWallColor("White")
                .setFlooring("Marble")
                .build();

        House simpleHouse = new House.Builder()
                .setRooms(2)
                .setBathrooms(1)
                .setFloors(1)
                .setGarage(false)
                .setSwimmingPool(false)
                .setGarden(true)
                .setBasement(false)
                .setRoofType("Flat Roof")
                .setWallColor("Blue")
                .setFlooring("Tiles")
                .build();

        System.out.println("LUXURY HOUSE: " + luxuryHouse);
        System.out.println("SIMPLE HOUSE: " + simpleHouse);
    }
}
