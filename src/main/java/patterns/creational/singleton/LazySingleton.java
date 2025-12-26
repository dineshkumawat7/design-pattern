package main.java.patterns.creational.singleton;

/**
 * In the context of the singleton pattern, lazy initialization restricts the creation of
 * the instance until it is requested for the first time.
 * Instance created only when needed.
 * Not thread-safe by default.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("LazySingleton instance created!");
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void show(){
        System.out.println("Hello from Lazy Singleton design pattern.");
    }
}
