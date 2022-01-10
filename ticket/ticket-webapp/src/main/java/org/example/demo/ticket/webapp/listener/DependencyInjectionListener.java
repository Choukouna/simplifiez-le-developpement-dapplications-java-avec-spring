package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.example.demo.ticket.business.ManagerFactoryImpl;
import org.example.demo.ticket.business.interfaces.ManagerFactory;
import org.example.demo.ticket.business.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;


public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent pServletContextEvent) {
        // Création de l'instance de ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactoryImpl();

        vManagerFactory.setProjetManager(new ProjetManagerImpl());
        vManagerFactory.setTicketManager(new TicketManagerImpl());

        // Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent pServletContextEvent) {
        // NOP
    }

}