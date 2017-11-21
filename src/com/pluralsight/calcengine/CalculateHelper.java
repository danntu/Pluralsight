package com.pluralsight.calcengine;

public class CalculateHelper {
    MathCommand command;
    double leftVal;
    double rightVal;
    public  double result;

    public void process(String statement) throws InvalidStatementException{
        //
        String[] parts = statement.split(" ");
        if (parts.length!=3)
            throw new InvalidStatementException("Incorrect number fields",statement);
        String commandstring=parts[0];
        try{
            leftVal=Double.parseDouble(parts[1]);
            rightVal=Double.parseDouble(parts[2]);
        } catch (NumberFormatException e){
            throw  new InvalidStatementException("Non-numeric data",statement,e);
        }


        setCommandFromString(commandstring);
        if (command==null)
            throw new InvalidStatementException("Invalid command",statement);

        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftVal,rightVal);
                break;
            case Substract:
                calculator = new Subtracter(leftVal,rightVal);
                break;
            case Multiply:
                calculator = new Multiplier(leftVal,rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal,rightVal);
                break;
        }
        calculator.calculate();
        result = calculator.getResult();

    }
    private void setCommandFromString(String commandString){
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command=MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Substract.toString()))
            command=MathCommand.Substract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command=MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command =MathCommand.Divide;
    }
}
