package di_8.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	private BookDao bookDao;

	@Autowired
	public BookService(BookDao bookDao) {
		this.bookDao = bookDao;
		System.out.println("BookService의 생성자 실행됨");
		System.out.println("BookService의 생성자가 전달받은 객체: " + bookDao);
	}
	
	
}
