package test.session04.practice;

import com.spring.core.session04.proxy.practice.Calculator;
import com.spring.core.session04.proxy.practice.CalculatorProxy;
import com.spring.core.session04.proxy.practice.ImplCalculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new CalculatorProxy(new ImplCalculator());
		
        System.out.println("5 + 2 = " + calculator.add(5, 2));
        System.out.println("5 - 2 = " + calculator.sub(5, 2));
        System.out.println("5 * 2 = " + calculator.mult(5, 2));
        System.out.println("5 / 2 = " + calculator.div(5, 2));
        System.out.println("5 / 0 = " + calculator.div(5, 0));
        
        ImplCalculator implCalculator = new ImplCalculator();
        System.out.println(implCalculator.add(1, 2));
	}

}
