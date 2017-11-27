package javacore.collection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("displayName","Myrzakanov Daniyar");
        properties.setProperty("accountNumber","123-45-6789");

        try(OutputStream out = Files.newOutputStream(Paths.get("props.xml"))){
            properties.storeToXML(out,"My comment");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(InputStream in = Files.newInputStream(Paths.get("props.xml"))){
            properties.loadFromXML(in);
        } catch (InvalidPropertiesFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.forEach((k,v)-> System.out.println(k+" "+v));

//        System.out.println(properties.getProperty("displayName"));
    }
}
