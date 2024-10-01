package di_5.scan;

public class BoardService {
	
	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
		System.out.println("BoardService의 setBoardDao() 메소드 실행됨");
		System.out.println("BoardService의 setBoardDao() 메소드의 매개변수로 전달된 객체: " + boardDao);
	}
	
	public BoardService() {
		
	}
	
	public void 게시글등록(String title, String content) {
		System.out.println("BoardService의 게시글등록() 메소드 실행됨");
		boardDao.inser(title, content);
	}
}
