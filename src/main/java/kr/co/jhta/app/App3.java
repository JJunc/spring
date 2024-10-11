package kr.co.jhta.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.mapper.BoardMapper;
import kr.co.jhta.vo.Board;
import kr.co.jhta.vo.Review;

public class App3 {
	public static void main(String[] args) {
		ApplicationContext ctx 
			= new ClassPathXmlApplicationContext("context/context.xml");
		
		BoardMapper boardMapper = ctx.getBean(BoardMapper.class);
//		Board board = boardMapper.getBoardByNo(1);
//		List<Review> reviews = board.getReviews();
//		System.out.println(board);
//		for(Board board : boards) {
//			System.out.println("글번호: " + board.getNo());
//			System.out.println(board.getTitle());
//			System.out.println(board.getContent());
//			System.out.println(board.getUser().getNo());
//			System.out.println(board.getUser().getName());
//			System.out.println(board.getUser().getId());
//			System.out.println();
//		}
//		
//		for(Review review : reviews) {
//			System.out.println(review.getTitle());
//		}
//		
		List<Board> findBoards = boardMapper.searchBoards1("title", "자바");
		for(Board board : findBoards) {
			System.out.println("글번호: " + board.getNo());
			System.out.println(board.getTitle());
			System.out.println(board.getContent());
			System.out.println();
		}
	}
}
