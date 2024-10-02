package di_7.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("context/di-7.xml");
		
		DBConnect connect = ac.getBean(DBConnect.class);
		connect.config();
	}
}
