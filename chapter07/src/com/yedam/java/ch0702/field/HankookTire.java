package com.yedam.java.ch0702.field;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation; // 회전수 1 증가
		if (accumulatedRotation < maxRotation) {
			// 현재 누적회전수가 최대회전수보다 작을 경우 정상주행
			System.out.println(location + " HankookTire 수명 : " 
			+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			// 현재 누적회전수가 최대회전수보다 작을 경우 정상주행
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}

}
