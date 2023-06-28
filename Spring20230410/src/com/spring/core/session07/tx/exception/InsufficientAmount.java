package com.spring.core.session07.tx.exception;

public class InsufficientAmount extends RuntimeException{ // 庫存量不足
	public InsufficientAmount(String message) {
		super(message);
	}
}
