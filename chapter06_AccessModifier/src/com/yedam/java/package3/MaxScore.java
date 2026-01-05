package com.yedam.java.package3;

public class MaxScore {
	// 필드
	private int idx = -1;
	private int score = 0;
	
	// 생성자
	public MaxScore() {}
	public MaxScore(int idx, int score) {
		this.idx = idx;
		this.score = score;
	}
	
	// 메소드
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
