package CarParking.Models;

public interface Gate {
    void generateTicket(Vehicle vehicle);
    void updateSpot(ParkingSpot parkingSpot);
}
