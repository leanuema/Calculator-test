package com.leandro.it.calculatorspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorSpringbootApplicationTests {

	@Test
	public void identificate_sState_oF_calculator_on() {

		Calculator calculator = new CalculatorStandard(State.ON);

		Assertions.assertEquals(State.ON, calculator.getState());
	}

	@Test
	public void identicate_state_of_calculator_off(){

		Calculator calculator = new CalculatorStandard(State.Off);

		Assertions.assertEquals(State.Off, calculator.getState());
	}

	@Test
	public void get_number_one_of_calculator(){

		Calculator calculator = new CalculatorStandard(State.ON);

		calculator.setNumberOne(2);

		Assertions.assertEquals(2, calculator.getNumberOne());
	}

	@Test
	public void get_number_two_of_calculator(){

		Calculator calculator = new CalculatorStandard(State.ON);

		calculator.setNumberTwo(4);

		Assertions.assertEquals(4, calculator.getNumberTwo());
	}

	@Test
	public void sum_of_two_numbers(){

		Calculator calculator = new CalculatorStandard(State.ON);

		calculator.sumOfTwoNumbers(4, 5);

		Assertions.assertEquals(9, calculator.getResult());
	}
}
