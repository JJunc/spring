package di_5.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// 스프링 컨테이너 생성하기
//		ApplicationContext ac = new ClassPathXmlApplicationContext("context/di-5.xml");
		ApplicationContext ac2 = new AnnotationConfigApplicationContext(BoardService.class);
		
		// 스프링 컨테이너에서 사용할 객체 꺼내기
		BoardService service = ac2.getBean(BoardService.class);
		
		// 객체 사용하기
		service.게시글등록("안녕하세요", "반갑습니다.");
	}
}
