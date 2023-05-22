package CarParking.Models;

public interface ExitGate extends Gate{
    Receipt payment(Ticket ticket);
}
