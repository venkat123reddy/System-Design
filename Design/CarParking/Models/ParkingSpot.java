package CarParking.Models;

import CarParking.Enums.VehicleTypes;

public class ParkingSpot {

    public int iD;
    public boolean isEmpty;
    public VehicleTypes vehicleType;

    ParkingSpot(VehicleTypes vehicleTypes)
    {
        this.vehicleType=vehicleTypes;
        this.isEmpty=false;
    }
    void updateSpot()
    {
        this.isEmpty=!this.isEmpty;
    }

}
