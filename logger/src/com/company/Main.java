package com.company;

import java.util.logging.*;

public class Main {
  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    LOGGER.warning("we have a problem");
    LOGGER.log(Level.INFO, "something happened" );
    LOGGER.setLevel(Level.ALL);
    Handler handlerOld = new ConsoleHandler();
    LOGGER.addHandler(handlerOld);
    handlerOld.setFormatter(new XMLFormatter());

    Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
    Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
    loggerA.setLevel(Level.ALL);
    loggerB.setLevel(Level.WARNING);
    Logger loggerMain = Logger.getLogger("org.stepic.java");
    loggerMain.setUseParentHandlers(true);
    Handler handler = new ConsoleHandler();
    handler.setLevel(Level.ALL);
    loggerMain.addHandler(handler);
    handler.setFormatter(new XMLFormatter());
  }
}
