package com.pluralsight.calcengine;

public class MathEquation {
    public double leftVals;
    public double rigthVal;
    public char opCode;
    public double result;

    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVals + rigthVal;
                break;
            case 's':
                result = leftVals - rigthVal;
                break;
            case 'd':
                result = rigthVal != 0.0d ? leftVals / rigthVal : 0.0d;
//            if (val2 !=0)
//              result=val1/val2;
//            else
//              result=0.0d;
                break;
            case 'm':
                result = leftVals * rigthVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
