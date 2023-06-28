package com.spring.core.session04.proxy.practice;

public interface Calculator {
	public abstract double add(double a, double b);
	public abstract double sub(double a, double b);
	public abstract double mult(double a, double b);
	public abstract double div(double a, double b) throws ArithmeticException;
}
