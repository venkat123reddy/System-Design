package StrategyPattern;

public class SportsVehicle implements Vehicle{

    StrategyDrive strategyDrive;
    SportsVehicle(SportsDrive sportsDrive)
    {
        this.strategyDrive=sportsDrive;
    }

    @Override
    public void drive() {

    }
}
