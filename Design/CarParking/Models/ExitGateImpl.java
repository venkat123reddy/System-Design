package CarParking.Models;

public class ExitGateImpl implements ExitGate{



    PaymentService paymentService = new PaymentService();

    @Override
    public Receipt payment(Ticket ticket) {
        return paymentService.paymentCalculation(ticket);
    }

    @Override
    public void generateTicket(Vehicle vehicle) {



    }

    @Override
    public void updateSpot(ParkingSpot parkingSpot) {
        parkingSpot.updateSpot();

    }
}
