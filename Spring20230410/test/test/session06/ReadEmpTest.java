package test.session06;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session06.dao.EmpDao;
import com.spring.core.session06.entity.Emp;

public class ReadEmpTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		EmpDao empDao = ctx.getBean(EmpDao.class);
		// 查詢多筆1
		List<Map<String, Object>> list = empDao.query();
//		System.out.println(list);

		for(Map<String, Object> l : list) {
			System.out.println(l);
		}
		
		// 查詢多筆2
		List<Emp> empsList = empDao.queryEmps();
//		System.out.println(empsList);
		
//		for(Emp emps : empsList) {
//			System.out.println(emps);
//		}
		
		empsList.forEach(e -> System.out.println(e));
		
		// 查詢單筆
		Optional<Emp> optEmp1 = empDao.getOne(5);
		
		if(!optEmp1.isEmpty()) { // 確認是否有資料
			Emp emp = optEmp1.get(); // 取得實體
			System.out.println(emp);
		}else {
			System.out.println("資料不存在");
		}
		
		// 查詢總筆數
		Integer count = empDao.count();
		System.out.println(count);
		
		// 查詢員工的平均年齡
		double avgOfAge = empsList.stream().mapToInt(Emp::getAge).average().getAsDouble();
		System.out.println(avgOfAge);
		
		double avgOfAge2 = empDao.getAvgOfAge();
		System.out.println(avgOfAge2);
	}
}