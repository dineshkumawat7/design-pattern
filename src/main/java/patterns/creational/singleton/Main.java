package main.java.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println("Are both instances same: " + (instance1 == instance2));
    }
}
