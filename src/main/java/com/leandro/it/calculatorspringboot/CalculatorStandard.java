package com.leandro.it.calculatorspringboot;

public class CalculatorStandard extends Calculator {


    public CalculatorStandard(State estado) {
        super(estado);
    }

    @Override
    int sumOfTwoNumbers(int numberOne, int numberTwo) {
        int result = 0;
        result = numberOne + numberTwo;
        return result;
    }
}
