package di_4.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {	
		// 스프링 컨테이너를 생성한다.
		/*
		 * 사용한 스프링 컨테이너
		 * 		ClassPathXmlApplicationContext
		 * 
		 * 설정파일의 경로와 파일명
		 * 		"context/di-4.xml"
		 * 아래의 수행문이 실행되면
		 * 	- SmsMessageSender 객체가 생성된다.
		 * 	- KakaoTalkMessageSender 객체가 생성된다.
		 * 	- NotificationService 객체가 생성된다.
		 *  - NotificationService 객체의 멤버변수에 
		 *    SmsMessageSender객체나 KakaoTalkMessageSende객체 중 하나가 의존성 주입된다. 
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("context/di-4.xml");
		
		// 스프링 컨테이너에서 필요한 객체를 꺼낸다.
		/*
		 * Object getBean(String beanName)
		 * T getBean(lass T)
		 * T getBean(String beanName, Class T)
		 */
		NotificationService notificationService1 = (NotificationService) ac.getBean("service1");
		NotificationService notificationService2 = ac.getBean("service2", NotificationService.class);
		notificationService1.notice("A", "B", "안녕하세요", "반갑습니다");
		notificationService2.notice("A", "B", "안녕하세요", "반갑습니다");
		
	}

}
