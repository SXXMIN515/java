package com.yedam.java.practice.book;

public class Book {
	// 필
	private int bookNum;
	private String title;
	private int price;
	
	// 생성자
	public Book() {}
	public Book(int bookNum, String title, int price) {
		this.bookNum = bookNum;
		this.title = title;
		this.price = price;
	}
	
	// 메소드
	public int getBookNum() {
		return this.bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		String info = "도서번호 : " + this.bookNum + " 도서제목 : " + this.title + " 가격 : " + this.price + "원";
		System.out.println(info);
	}
}
