package com.pluralsight.myapp;

import com.pluralsight.calcengine.*;

public class Main {
    public static void main(String[] args) {
        String[] statements = {
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100 50",
                "add 25 92",
                "substract 225 17",
                "multiply 11 3"
        };
        CalculateHelper helper = new CalculateHelper();
        for (String statement:
             statements) {
            try{
                helper.process(statement);
                System.out.println(helper.result);
            } catch (InvalidStatementException e){
                System.out.println(e.getMessage());
                if (e.getCause() !=null)
                    System.out.println("Original Exception "+e.getCause().getMessage());
            }

        }
        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.print("test = ");
        System.out.println(testEquation.getResult());

        MathEquation[] equations =new MathEquation[4];
        equations[0]= new MathEquation(100.0d,50.0d,'d');
        equations[1]= new MathEquation(25.0d,92.0d,'a');
        equations[2]= new MathEquation(225.0d,17.0d,'s');
        equations[3]= new MathEquation(11.0d,3.0d,'m');


        for (MathEquation equation:
             equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overload");
        System.out.println();

        double leftDouble=9.0d;
        double rigthDouble=4.0d;
        int leftInt=9;
        int rightInt=4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rigthDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftInt,rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators ={
                new Divider(100,50),
                new Adder(25,92),
                new Subtracter(225,17),
                new Multiplier(11,3)
        };
        for (CalculateBase calculator:
             calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }
    public static  MathEquation create(double leftVal,double rightVal,char opCode){
        MathEquation equation = new MathEquation();
        equation.setleftVal(leftVal);
        equation.setRigthVal(rightVal);
        equation.setOpCode(opCode);
        return  equation;

    }

}
