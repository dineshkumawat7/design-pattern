package main.java.patterns.creational.singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n:::::::::::::::::::::::::: Singleton Design Pattern ::::::::::::::::::::::::::");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1: " + singleton1);
        System.out.println("singleton2: " + singleton2);

        System.out.println("Are both instances same: " + (singleton1 == singleton2));
        singleton1.show();

        System.out.println("\n::::::::::::::::::::::: Eager Initialization Singleton :::::::::::::::::::::::");
        EagerSingleton eagerSingleton1= EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2= EagerSingleton.getInstance();

        System.out.println("eagerSingleton1: " + eagerSingleton1);
        System.out.println("eagerSingleton2: " + eagerSingleton2);

        System.out.println("Are both instances same: " + (eagerSingleton1 == eagerSingleton2));
        eagerSingleton1.show();

        System.out.println("\n::::::::::::::::::::::: Lazy Initialization Singleton :::::::::::::::::::::::");
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2= LazySingleton.getInstance();

        System.out.println("lazySingleton1: " + lazySingleton1);
        System.out.println("lazySingleton2: " + lazySingleton2);

        System.out.println("Are both instances same: " + (lazySingleton1 == lazySingleton2));
        lazySingleton2.show();

        System.out.println("\n::::::::::::::::::: Thread-Safe Singleton (Synchronized) ::::::::::::::::::::");
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

        System.out.println("threadSafeSingleton1: " + threadSafeSingleton1);
        System.out.println("threadSafeSingleton2: " + threadSafeSingleton2);

        System.out.println("Are both instances same: " + (threadSafeSingleton1 == threadSafeSingleton2));
        threadSafeSingleton1.show();
    }
}
