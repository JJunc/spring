package kr.co.jhta.vo;

import java.util.Date;

public class Review {
	
	private int no;
	private String title;
	private String content;
	private int point;
	private String delete;
	private Date createdDate;
	private Date updatedDate;
	private Board board;
	private User user;
	
	public Review() {
		super();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getDelete() {
		return delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Review(int no, String title, String content, int point, String delete, Date createdDate, Date updatedDate,
			Board board, User user) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.point = point;
		this.delete = delete;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.board = board;
		this.user = user;
	}
	
	
}
