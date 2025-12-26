package main.java.patterns.creational.singleton;

/**
 * A ThreadSafeSingleton is a version of the Singleton design pattern that is safe
 * to use in multi-threaded programs.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        System.out.println("ThreadSafeSingleton instance created!");
    }

    public synchronized static ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void show(){
        System.out.println("Hello from Thread Safe Singleton design pattern.");
    }
}
