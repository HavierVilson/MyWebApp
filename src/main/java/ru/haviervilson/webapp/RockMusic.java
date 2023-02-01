package ru.haviervilson.webapp;

public class RockMusic implements Music{
    public void doMyInit() {
        System.out.println("My Init");
    }

    public void doMyDestroy() {
        System.out.println("My Destroy");
    }

    @Override
    public String getSong() {
        return "Toxic city";
    }
}
