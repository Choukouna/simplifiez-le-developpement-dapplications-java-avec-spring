package org.example.demo.ticket.business.interfaces;

public interface ManagerFactory {
    public ProjetManager getProjetManager();
    public void setProjetManager(ProjetManager pm);

    public TicketManager getTicketManager();
    public void setTicketManager(TicketManager tm);
}
