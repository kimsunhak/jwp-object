package object.ch1.ticket;

import object.ch1.audience.Audience;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.Buy(ticketOffice.getTicket()));
    }
}
