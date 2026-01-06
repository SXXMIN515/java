package com.yedam.java.practice.student;

public class Student {
	private String name;
	private int score;
	
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showInfo() {
		String info = this.name + " | " + this.score;
		System.out.println(info);
	}
	
}
