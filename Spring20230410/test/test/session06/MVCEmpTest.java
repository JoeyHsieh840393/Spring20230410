package test.session06;

import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.spring.core.session06.controller.EmpController;
import com.spring.core.session06.dao.EmpDao;
import com.spring.core.session06.entity.Emp;

public class MVCEmpTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpController empController = ctx.getBean(EmpController.class);
		
		List<Emp> emps = empController.findAll();
		System.out.println(emps);
		
		Optional<Emp> optEmp = empController.getBigOne();
		if(optEmp.isPresent()) {
			System.out.println(optEmp.get());
		}else {
			System.out.println("查無資料");
		}
		
	}
}
