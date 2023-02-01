package ru.haviervilson.webapp;

public class ClassicMusic implements Music{
    private ClassicMusic() {}

    public static ClassicMusic getClassicalMusic() {
        return new ClassicMusic();
    }

    public void doMyInit() {
        System.out.println("My Init");
    }

    public void doMyDestroy() {
        System.out.println("My Destroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
