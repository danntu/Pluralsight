package javacore.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerWriteToFile {
    static Logger logger =Logger.getLogger("javacore.log");

    public static void main(String[] args) throws IOException{
        FileHandler h = new FileHandler("%h/myapp_%g.log",1000,4);
        h.setFormatter(new SimpleFormatter());
        logger.addHandler(h);
    }
}
