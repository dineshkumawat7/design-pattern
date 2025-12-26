package main.java.patterns.creational.singleton;

/**
 * This is a solution where an instance of a class is created much before it is actually required.
 * It is mostly done on system startup.
 * <p>
 * In an eager initialization singleton pattern, the singleton instance is created irrespective
 * of whether any other class actually asked for its instance or not. This is done usually using
 * a static variable as these get initialized at the application startup, always.
 * </p>
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("EagerSingleton instance created!");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void show(){
        System.out.println("Hello from Eager Singleton design pattern.");
    }
}
