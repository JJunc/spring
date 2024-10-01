package di_5.scan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class UserDao implements Dao{
	
	public UserDao() {
		System.out.println("UserDao의 생성자 메소드 실행됨");
	}
	
	@Override
	public void insert(String title, String content) {
		System.out.println("UserDao의 insert() 메소드 실행됨");
	}
}
