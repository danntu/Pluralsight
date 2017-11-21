package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVals;
    private double rigthVal;
    private char opCode='a';
    private double result;

    public double getRigthVal() {
        return rigthVal;
    }

    public void setRigthVal(double rigthVal) {
        this.rigthVal = rigthVal;
    }

    public double getLeftVals() {
        return leftVals;
    }

    public void setLeftVals(double leftVals) {
        this.leftVals = leftVals;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }



    public double getResult(){
        return  result;
    }

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(double leftVals, double rigthVal, char opCode) {
        this(opCode);
        this.leftVals = leftVals;
        this.rigthVal = rigthVal;

    }

    public MathEquation() {
    }

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
