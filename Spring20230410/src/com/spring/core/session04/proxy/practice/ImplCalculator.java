package com.spring.core.session04.proxy.practice;

public class ImplCalculator implements Calculator{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double mult(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double div(double a, double b) throws ArithmeticException{
		if(b == 0.0) {
			throw new ArithmeticException("分母不能為零");
		}
		return a / b;
	}
	
	

}
