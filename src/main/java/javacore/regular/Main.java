package javacore.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s1 = "apple, apple and orange please";
        String s2 = s1.replaceAll("ple","ricot");
        System.out.println(s2);
        String s3 = s1.replaceAll("ple\\b","ricot");
        System.out.println(s3);
        String[] parts = s1.split("\\b");
        for (String thePart:parts)
            if (thePart.matches("\\w+"))
                System.out.print(thePart+" ");

        // Pattern p = Pattern.compile("apple");

    }
}
