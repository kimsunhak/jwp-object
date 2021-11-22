package object.ch1;

import object.ch1.audience.Audience;
import object.ch1.ticket.Ticket;
import object.ch1.ticket.TicketSeller;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
