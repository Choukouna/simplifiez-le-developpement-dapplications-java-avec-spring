package org.example.demo.ticket.business.interfaces;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface ProjetManager {
    Projet getProjet(Integer pId) throws NotFoundException;
    public List<Projet> getListProjet();
}
