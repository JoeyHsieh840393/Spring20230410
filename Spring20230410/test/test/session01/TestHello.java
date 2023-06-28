package test.session01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.bean.Hello;

public class TestHello {
	public static void main(String[] args) {
		// 傳統用法
		Hello hello = new Hello();
		System.out.println("Hello1: " + hello);
		
		// Spring 用法(透過 beans-config.XML 得到 Hello 的物件實體)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		
		Hello hello2 = (Hello)ctx.getBean("hello0"); // 根據 id 尋找
		System.out.println("Hello2: " + hello2);
		
		Hello hello3 = ctx.getBean(Hello.class); // 根據 Class 尋找
		System.out.println("Hello3: " + hello3);
		
		Hello hello4 = ctx.getBean("hello0", Hello.class); // 建議使用
		System.out.println("Hello4: " + hello4);
	}
}
