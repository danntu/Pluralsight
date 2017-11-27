package javacore.property;

public class Main {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        String osVersion = System.getProperty("os.version");
        String userHome = System.getProperty("user.home");
        String osArchitecture = System.getProperty("os.arch");
        String javavendor = System.getProperty("java.vendor");

        System.out.println(userName);
        System.out.println(osVersion);
        System.out.println(userHome);
        System.out.println(osArchitecture);
        System.out.println(javavendor);
    }
}
