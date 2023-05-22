package CarParking.Models;

import java.util.Date;

public class PaymentService {

    Receipt paymentCalculation(Ticket ticket)
    {
        Receipt receipt = new Receipt();
        receipt.setEntryDate(ticket.getEntryDate());
        receipt.setExitDate(new Date());
        receipt.setTotalHours(5);
        receipt.setTotalAmount(ticket.getCost()*5);
        return receipt;
    }
}
