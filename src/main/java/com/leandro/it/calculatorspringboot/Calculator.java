package com.leandro.it.calculatorspringboot;

public abstract class Calculator {

    private State state;
    private Integer numberOne;
    private Integer numberTwo;
    private Integer result;

    public Calculator(State state) {
        this.state = state;
    }

    State getState() {
        return this.state;
    }

    Integer getNumberOne() {
        return numberOne;
    }

    void setNumberOne(Integer numberOne) {
        this.numberOne = numberOne;
    }

    Integer getNumberTwo() {
        return numberTwo;
    }

    void setNumberTwo(Integer numberTwo) {
        this.numberTwo = numberTwo;
    }

    abstract int sumOfTwoNumbers(int numberOne, int numberTwo);

    public Integer getResult() {
        return this.result = 0;
    }
}

