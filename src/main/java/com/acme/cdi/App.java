package com.acme.cdi;

import java.util.Collections;
import java.util.Properties;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.weld.environment.se.events.ContainerInitialized;

public class App 
{
    @Inject
    private InjectedClass injected;
    
    @Inject @Named("applicationSettings")
    private Properties props;
    
    private void printInjected() {
        System.out.println("\n\n### Injected value:" + injected.getValue());
        printProperties();
        
    }

    private void printProperties() {
        for (Object key : Collections.list(props.keys())) {
            System.out.println("\t next " + key + " " + props.getProperty((String) key));
        }
    }
    
    public void starup(@Observes ContainerInitialized event){
          printInjected();
    }
    
}
