package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rigthVal;
    private char opCode='a';
    private double result;

    public double getRigthVal() {
        return rigthVal;
    }

    public void setRigthVal(double rigthVal) {
        this.rigthVal = rigthVal;
    }

    public double getleftVal() {
        return leftVal;
    }

    public void setleftVal(double leftVal) {
        this.leftVal = leftVal;
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

    public MathEquation(double leftVal, double rigthVal, char opCode) {
        this(opCode);
        this.leftVal = leftVal;
        this.rigthVal = rigthVal;

    }

    public MathEquation() {
    }

    public  void execute(double leftVal, double rigthVal){
        this.leftVal=leftVal;
        this.rigthVal=rigthVal;
        execute();
    }
    public  void execute(int leftVal, int rigthVal){
        this.leftVal=leftVal;
        this.rigthVal=rigthVal;
        execute();

        result = (int)result;
    }

    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rigthVal;
                break;
            case 's':
                result = leftVal - rigthVal;
                break;
            case 'd':
                result = rigthVal != 0.0d ? leftVal / rigthVal : 0.0d;
//            if (val2 !=0)
//              result=val1/val2;
//            else
//              result=0.0d;
                break;
            case 'm':
                result = leftVal * rigthVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
