package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.BoardRegisterForm;
import com.example.demo.dto.CommentRegisterForm;
import com.example.demo.dto.ListDto;
import com.example.demo.exception.RestStoreException;
import com.example.demo.exception.StoreException;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.util.Pagination;
import com.example.demo.vo.Board;
import com.example.demo.vo.Comment;
import com.example.demo.vo.User;

@Service
@Transactional
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private CommentMapper commentMapper;

	public void addNewBoard(Board board) {
		boardMapper.insertBoard(board);
	}

	public ListDto<Board> getBoards(Map<String, Object> condition) {
		// 조회조건에 맞는 총 데이터갯수를 조회한다.
		// condition => page, opt, keyword
		int totalRows = boardMapper.getTotalRows(condition);
		
		// 현재 페이지번호, 총갯수로 Pagination객체를 생성한다.
		int page = (Integer) condition.get("page");
		Pagination pagination = new Pagination(page, totalRows);
		
		// 페이지번호에 맞는 데이터 조회범위를 검색조건에 추가한다.
		condition.put("begin", pagination.getBegin());
		condition.put("end", pagination.getEnd());
		
		// 검색조건에 맞는 게시글 데이터 조회
		// condition => page, opt, keyword, begin, end
		List<Board> boards = boardMapper.getBoards(condition);
		
		// 조회된 게시글목록, Pagination를 ListDto 객체에 저장
		ListDto<Board> dto = new ListDto<>(boards, pagination);
		
		return dto;
	}
	
	public Board getBoardDetail(int boardNo) {
		Board board = boardMapper.getBoardByNo(boardNo);
		if (board == null) {
			throw new StoreException("["+boardNo+"] 번 게시글이 없습니다.");
		}
		return board;
	}

	public Comment addNewComment(CommentRegisterForm form, int userNo) {
		Comment comment = new Comment();
		comment.setTitle(form.getTitle());
		comment.setContent(form.getContent());
		comment.setCreatedDate(new Date());
		
		Board board = new Board();
		board.setNo(form.getBoardNo());
		comment.setBoard(board);
		
		User user = userMapper.getUserByNo(userNo);
		comment.setUser(user);
		
		commentMapper.insertComment(comment);
		
		return comment;
	}

	public List<Comment> getComments(int boardNo) {
		return commentMapper.getCommentsByBoardNo(boardNo);
	}

	public void deleteComment(int commentNo, int userNo) {
		Comment comment = commentMapper.getCommentByNo(commentNo);
		if (comment.getUser().getNo() != userNo) {
			throw new RestStoreException("다른 사람이 작성한 댓글은 삭제할 수 없습니다.");
		}
		
		commentMapper.deleteComment(commentNo);
	}
	
}










