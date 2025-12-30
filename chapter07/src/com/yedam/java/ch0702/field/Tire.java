package com.yedam.java.ch0702.field;

// 부모클래스
public class Tire {
	// 필드
	public int maxRotation; // 최대회전수(수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotation; // 회전수 1 증가
		if (accumulatedRotation < maxRotation) {
			// 현재 누적회전수가 최대회전수보다 작을 경우 정상주행
			System.out.println(location + " Tire 수명 : " 
			+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			// 현재 누적회전수가 최대회전수보다 작을 경우 정상주행
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
