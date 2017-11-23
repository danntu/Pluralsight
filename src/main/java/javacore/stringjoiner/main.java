package javacore.stringjoiner;

import java.util.StringJoiner;

public class main {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("},{", "{","}");
        sj.add("alpha");
        sj.add("theata");
        sj.add("gamma");
        System.out.print(sj.toString());

        StringJoiner sj1 = new StringJoiner(", ");
        sj1.setEmptyValue("EMPTY");
        System.out.println(sj1.toString());
    }
}
