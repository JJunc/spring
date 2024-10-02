package di_8.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	@Autowired
	public BookDao() {
		System.out.println("BookDao객체 생성자 실행됨");
	}
}
