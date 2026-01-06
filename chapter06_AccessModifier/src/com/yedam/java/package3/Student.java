package com.yedam.java.package3;

public class Student {
	// 필드 => private, 외부에서 접근 불
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore; 
	
	// 생성자
	public Student() {}
	public Student(String name, int korScore, int mathScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}	
	
	// 메소드 => getter/setter
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
