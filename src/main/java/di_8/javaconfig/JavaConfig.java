package di_8.javaconfig;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "di_8.javaconfig")
public class JavaConfig {
	
	@Bean
	public MyDao myDao() {
		return new MyDao();
	}
	
	@Bean
	public MyService myService(MyDao myDao) {
		System.out.println("@Bean myService");
		return new MyService(myDao);
	}
	
}
