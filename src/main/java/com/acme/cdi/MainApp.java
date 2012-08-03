package com.acme.cdi;

import org.jboss.weld.environment.se.WeldContainer;

public class MainApp {

  public static void main(String[] args) {
     WeldContainer weld = new Weld().initialize();
     //weld.instance().select(MyApplicationBean.class).get();
     weld.shutdown();
  }
}