package javacore.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        String value1 ="apple, apple and orange please";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(value1);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
