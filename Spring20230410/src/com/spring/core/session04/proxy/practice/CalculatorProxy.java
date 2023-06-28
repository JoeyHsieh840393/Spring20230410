package com.spring.core.session04.proxy.practice;

public class CalculatorProxy implements Calculator{
	
	Calculator calculator;
	String sign;

	public CalculatorProxy(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public double add(double a, double b) {
		return calculator.add(a, b);
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return calculator.sub(a, b);
	}

	@Override
	public double mult(double a, double b) {
		// TODO Auto-generated method stub
		return calculator.mult(a, b);
	}

	@Override
	public double div(double a, double b) throws ArithmeticException {
		double result = 0.0;
		try {
			result = calculator.div(a, b);
		}catch (Exception e) {
			System.out.println("Error: " + e);	
			result = 0.0;
		}
		return result;
	}
}
