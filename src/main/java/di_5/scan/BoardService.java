package di_5.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class BoardService {
	
	private Dao dao;
	
	
	public BoardService(Dao dao) {
		super();
		this.dao = dao;
	}

	@Autowired
	public void setBoardDao(BoardDao boardDao) {
		this.dao = boardDao;
		System.out.println("BoardService의 setBoardDao() 메소드 실행됨");
		System.out.println("BoardService의 setBoardDao() 메소드의 매개변수로 전달된 객체: " + boardDao);
	}
	
	public BoardService() {
		
	}
	
	public void 게시글등록(String title, String content) {
		System.out.println("BoardService의 게시글등록() 메소드 실행됨");
		dao.insert(title, content);
	}
}
