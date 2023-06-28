package test.session04.practice;

import com.spring.core.session04.proxy.practice3.ATM;
import com.spring.core.session04.proxy.practice3.ATMController;
import com.spring.core.session04.proxy.practice3.ATMControllerProxy;

public class ATMControllerProxyTest {
	public static void main(String[] args) {
		ATM atm = new ATMControllerProxy(new ATMController(1000));
		
		atm.deposit(1000);
		atm.query();
		atm.draw(2500);
		atm.query();
	}
}
