package di_6.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ac 
			= new ClassPathXmlApplicationContext("context/di-6.xml");
		
		
	}
}
