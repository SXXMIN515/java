package com.yedam.java.practice.book;

public class BookAnalysis {
	private int idx = -1;
	private int price = 0;
	
	public BookAnalysis() {}
	public BookAnalysis(int idx, int price) {
		this.idx = idx;
		this.price = price;
	}
	
	public int getIdx() {
		return this.idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
