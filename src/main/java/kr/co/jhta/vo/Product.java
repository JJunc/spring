package kr.co.jhta.vo;

import java.util.Date;

public class Product {
	private int no;
	private int price;
	private int discountPrice;
	private String name;
	private Company maker;
	private double discountRate;
	private int stock;
	private boolean soldOut;
	private Date createdDate;
	
	public Product() {
		super();
	}

	public Product(int no, String name, Company maker, int price, boolean soldOut) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.maker = maker;
		this.discountRate = 0.15;
		this.stock = 10;
		this.soldOut = soldOut;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getMaker() {
		return maker;
	}

	public void setMaker(Company maker) {
		this.maker = maker;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getDiscountPrice() {
		return (int) (price* (1-discountRate));
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
	
	
	
}
