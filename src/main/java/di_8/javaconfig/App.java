package di_8.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		
	}
}
