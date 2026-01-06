package com.yedam.java.practice.student;

public class CalculateScore {
	private int idx = -1;
	private int score = 0;
	
	public CalculateScore() {}
	public CalculateScore(int idx, int score) {
		this.idx = idx;
		this.score = score;
	}
	
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
