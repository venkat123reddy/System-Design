package StrategyPattern;

public class NormalVehicle implements Vehicle{

    StrategyDrive strategyDrive;

    NormalVehicle(NormalDrive normalDrive)
    {
        this.strategyDrive=normalDrive;
    }

    @Override
    public void drive() {

        System.out.println("Normal Vehicle");

    }
}