package com.pluralsight.calcengine;

public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d,225.0d,11.0d};

        double[] rigthVal={50.0d,92.0d,17.0d,3.0d};

        char[] opCodes={'d','a','s','m'};
        double[] result =new double[opCodes.length];

        for (int i = 0; i <opCodes.length ; i++) {
            switch (opCodes[i]) {
                case 'a':
                    result[i] = leftVals[i] + rigthVal[i];
                    break;
                case 's':
                    result[i] = leftVals[i] - rigthVal[i];
                    break;
                case 'd':
                    result[i] = rigthVal[i] != 0.0d ? leftVals[i] / rigthVal[i] : 0.0d;
//            if (val2 !=0)
//              result=val1/val2;
//            else
//              result=0.0d;
                    break;
                case 'm':
                    result[i] = leftVals[i] * rigthVal[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    result[i] = 0.0d;
                    break;
                }
            }

        for (double theResult:
             result) {
            System.out.print("result = ");
            System.out.println(theResult);
        }


    }
}
