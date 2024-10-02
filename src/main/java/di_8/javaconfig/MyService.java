package di_8.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {
	MyDao myDao;

	public MyService(MyDao myDao) {
		this.myDao = myDao;
		System.out.println("MyService의 생성자 실행됨");
		System.out.println("MyService의 생성자가 전달받은 객체: " + myDao);
	}
	
	
}
