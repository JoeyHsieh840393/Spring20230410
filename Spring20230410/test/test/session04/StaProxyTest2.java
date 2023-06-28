package test.session04;

import com.spring.core.session04.proxy.sta.Animal;
import com.spring.core.session04.proxy.sta.AnimalProxy;
import com.spring.core.session04.proxy.sta.Cat;
import com.spring.core.session04.proxy.sta.Dog;

public class StaProxyTest2 {
	public static void main(String[] args) {

		Animal cat = new AnimalProxy(new Cat());
		Animal dog = new AnimalProxy(new Dog());

		cat.Play();
		System.out.println();
		dog.Play();
	}
}
