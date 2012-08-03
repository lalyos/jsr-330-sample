package com.acme.cdi;

import java.util.Properties;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class PropertiesProducer {
  
  @Produces
  @Named("applicationSettings")
  public Properties getProps() {
      Properties props = new Properties();
      props.put("url", "htpp://foo.com");
      props.put("user", "admin");
      props.put("pwd", "secret");
      return props;
  }
}