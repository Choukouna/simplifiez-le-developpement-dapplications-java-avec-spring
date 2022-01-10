package org.example.demo.ticket.business;

import org.example.demo.ticket.business.interfaces.ManagerFactory;
import org.example.demo.ticket.business.interfaces.ProjetManager;
import org.example.demo.ticket.business.interfaces.TicketManager;

public class ManagerFactoryImpl implements ManagerFactory {

    private ProjetManager projetManager;
    private TicketManager ticketManager;

    public ProjetManager getProjetManager() {
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager pm) {
        this.projetManager = pm;
    }

    public TicketManager getTicketManager() {
        return this.ticketManager;
    }

    public void setTicketManager(TicketManager tm) {
        this.ticketManager = tm;
    }
}