package com.company.practice11;

import java.util.HashMap;
import java.util.Map;

public class Calc {
    Map<String, Operation> operations = new HashMap<String, Operation>();

    public void addOperation(String operationName, Operation implementation){
        operations.put(operationName, implementation);
    }

    public double calculate (String operationName, Double var1, Double var2){
        return operations.get(operationName).doOperation(var1, var2);
    }

}

interface Operation{
    Double doOperation(Double number1, Double number2) throws ArithmeticException;
}
