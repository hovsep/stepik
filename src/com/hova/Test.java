package com.hova;


import java.util.logging.*;

public class Test {

    public static void main(String[] args) {
        Logger l1 = java.util.logging.Logger.getLogger("org.stepic.java.logging.ClassA");
        l1.setLevel(Level.ALL);
        l1.setUseParentHandlers(true);

        Logger l2 = java.util.logging.Logger.getLogger("org.stepic.java.logging.ClassB");
        l2.setLevel(Level.WARNING);
        l2.setUseParentHandlers(true);

        Handler h = new ConsoleHandler();
        Formatter f = new XMLFormatter();
        h.setFormatter(f);
        h.setLevel(Level.ALL);
        Logger l3 = java.util.logging.Logger.getLogger("org.stepic.java");
        l3.setUseParentHandlers(false);
        l3.addHandler(h);

    }


}
