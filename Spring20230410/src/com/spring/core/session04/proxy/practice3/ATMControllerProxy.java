package com.spring.core.session04.proxy.practice3;

public class ATMControllerProxy implements ATM{
	private ATM atm;
	
	public ATMControllerProxy(ATM atm) {
		super();
		this.atm = atm;
	}

	@Override
	public void deposit(Integer num) {
		System.out.println("存款中...");
		atm.deposit(num);
		System.out.println("存款完成");
	}

	@Override
	public void draw(Integer num) {
		try {
			atm.draw(num);
			System.out.println("發鈔中...");
			System.out.println("發鈔完成，請取走現金");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void query() {
		System.out.println("查詢餘額中...");
		System.out.println("餘額如下：");
		atm.query();
	}

}
