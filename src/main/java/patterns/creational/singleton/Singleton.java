package main.java.patterns.creational.singleton;

/**
 * Singleton pattern enables an application to create the one and only one instance
 * of a Java class per JVM, in all possible scenarios.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void show(){
        System.out.println("Hello from Singleton design pattern.");
    }
}
