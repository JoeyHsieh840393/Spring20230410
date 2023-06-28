package com.spring.core.session07.tx.exception;

public class InsufficientStock extends RuntimeException{ // 庫存量不足
	public InsufficientStock(String message) {
		super(message);
	}
}
