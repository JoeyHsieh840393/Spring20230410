package test.session04;

import org.springframework.cglib.proxy.Enhancer;

import com.spring.core.session04.proxy.enhancer.EnhancerHello;
import com.spring.core.session04.proxy.enhancer.Hello;
import com.spring.core.session04.proxy.enhancer.MyMethodInterceptor;

public class HelloTest {
	public static void main(String[] args) {
//		// 一般執行(無代理)
//		Hello hello1 = new Hello();
//		System.out.println(hello1.sayHello("John"));
//		
//		// 透過增強子類別執行(增強子類別 = 代理者)，屬於靜態模式
//		Hello hello2 = new EnhancerHello();
//		System.out.println(hello2.sayHello("John"));
		
		// 透過 cglib 來實現動態代理
		//1. 建立增強器( cglib 本身就有內建 )
		Enhancer enhancer = new Enhancer();
		//2. 要增強的對象
		enhancer.setSuperclass(Hello.class);
		//3. 配置方法攔截器
		enhancer.setCallback(new MyMethodInterceptor());
		//4. 透過 enhancer 來得到代理物件
		Hello hello = (Hello) enhancer.create();
		System.out.println(hello.sayHello("John"));
	}
}
