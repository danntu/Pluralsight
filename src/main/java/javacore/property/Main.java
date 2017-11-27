package javacore.property;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        String osVersion = System.getProperty("os.version");
        String userHome = System.getProperty("user.home");
        String osArchitecture = System.getProperty("os.arch");
        String javavendor = System.getProperty("java.vendor");
        Map<String,String> map = System.getenv();
        map.forEach((k,v)->System.out.println(k+" : "+v));


        System.out.println(userName);
        System.out.println(osVersion);
        System.out.println(userHome);
        System.out.println(osArchitecture);
        System.out.println(javavendor);

        System.out.println("JAVA_HOME " +System.getenv("JAVA_HOME"));
    }
}
