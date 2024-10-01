package di_5.scan;

public class BoardDao {
	
	public BoardDao() {
		System.out.println("BoardDao의 생성자 메소드 실행됨");
	}
	
	public void inser(String title, String content) {
		System.out.println("BoardDao의 insert() 메소드 실행됨");
	}
}
