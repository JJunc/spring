package di_5.scan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("BoardDao")
public class BoardDao implements Dao{
	
	public BoardDao() {
		System.out.println("BoardDao의 생성자 메소드 실행됨");
	}
	
	@Override
	public void insert(String title, String content) {
		System.out.println("BoardDao의 insert() 메소드 실행됨");
		System.out.println("제목: " + title);
		System.out.println("내용: " + content);
		System.out.println("BoardDao의 insert() 메소드 종료됨");
	}
	
}
