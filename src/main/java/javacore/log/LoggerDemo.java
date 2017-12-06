package javacore.log;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {
    void doWork(){
        logger.setLevel(Level.ALL);
        logger.entering("javacore.log.LoggerDemo","doWork");
        logger.logp(Level.WARNING,"javacore.log.LoggerDemo","doWork","Empty Function");
        logger.exiting("javacore.log.LoggerDemo","doWork");
    }
    static  Logger logger =
            LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO,"My first log message");
        logger.log(Level.SEVERE,"Uh Oh!!");
        logger.log(Level.WARNING,"Another Message");
        logger.logp(Level.SEVERE,"javacore.log.LoggerDemo","myMethod","It broke");
        LoggerDemo ob = new LoggerDemo();
        ob.doWork();
    }
}
