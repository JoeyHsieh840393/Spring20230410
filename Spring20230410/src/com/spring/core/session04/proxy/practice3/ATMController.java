package com.spring.core.session04.proxy.practice3;

public class ATMController implements ATM{
	private Integer money;
	
	public ATMController(Integer money) {
		super();
		this.money = money;
	}

	@Override
	public void deposit(Integer amount) {
		money += amount;		
	}

	@Override
	public void draw(Integer amount) {
		if(amount > money) {
			throw new RuntimeException("餘額不足，請重新交易");
		}else {
			money -= amount;
		}
	}

	@Override
	public void query() {
		System.out.println(money);
	}

}
