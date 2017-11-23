package javacore.stringjoiner;

public class Formatting {
    public static void main(String[] args) {
        int  david=13, dawson=11,dillon=4,gordon=2;
        double avgDiff= ((david-dawson)+(dawson-dillon)+(dillon-gordon))/3.0d;

        String s1 =
                "My nephews are "+david+", "+dawson+", "+dillon+", and "+gordon+" years old";
        System.out.println(s1);
        String s2 = String.format("My nephews are %d, %d, %d, and %d years old",david,dawson,dillon,gordon);
        System.out.println(s2);
        String s3 = "The average age between each is "+avgDiff+" years";
        System.out.println(s3);
        String s4 = String.format("The average age between each is %.1f years",avgDiff);
        System.out.println(s4);
        String s5 =  String.format("%#x",1456);
        System.out.println(s5);
        String s6 =String.format("W:%04d X:%04d",5,235);
        System.out.println(s6);
        String s7 =  String.format("%+,.2f",12345678.9);
        System.out.println(s7);
    }
}
