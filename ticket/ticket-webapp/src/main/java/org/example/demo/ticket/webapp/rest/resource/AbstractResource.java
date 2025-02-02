package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.interfaces.ManagerFactory;

public abstract class AbstractResource {
    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory mf) {
        managerFactory = mf;
    }
}
