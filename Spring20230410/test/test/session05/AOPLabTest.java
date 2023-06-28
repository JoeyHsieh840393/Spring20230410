package test.session05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.session05.aop_lab.AOPConfig;
import com.spring.core.session05.aop_lab.Performance;
import com.spring.core.session05.aop_lab.Singer;

public class AOPLabTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance dancer = ctx.getBean("dancer", Performance.class);
		try {
			dancer.perform();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("舞者想轉換跑道");
			
			System.out.println("Dancer 轉 Singer");
			
			Singer singer = (Singer) dancer; // 橫向轉型
			singer.sing();
		}
		
	}
}
