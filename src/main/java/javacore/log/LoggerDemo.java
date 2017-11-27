package javacore.log;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO,"My first log message");
        logger.log(Level.WARNING,"Another Message");
    }
}
