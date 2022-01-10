package org.example.demo.ticket.business.interfaces;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public interface TicketManager {
    public Ticket getTicket(Long pNumero) throws NotFoundException;
    public List<Ticket> getListTicket(RechercheTicket pRechercheTicket);
}