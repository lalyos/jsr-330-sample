package com.acme.cdi;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.jboss.weld.environment.se.events.ContainerInitialized;

public class App 
{
    @Inject
    private InjectedClass injected;
    
    private void printInjected() {
        System.out.println("\n\n### Injected value:" + injected.getValue());
    }
    
    public void starup(@Observes ContainerInitialized event){
          printInjected();
    }
    
}
