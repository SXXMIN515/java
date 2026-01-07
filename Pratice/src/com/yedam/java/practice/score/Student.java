package com.yedam.java.practice.score;

public class Student {
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;
	
	public Student() {}
	public Student(String name, int korScore, int mathScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorScore() {
		return this.korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return this.mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return this.engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public void showInfo() {
		String info = this.name + " | " + this.korScore + " | " + this.mathScore + " | " + this.engScore; 
		System.out.println(info);
	}
	
}
