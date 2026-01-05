package com.yedam.java.ch1002;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // 원래대로면 return 만나서 여기서 종료되어야함.
		} finally { // 어떤 경우에도 실행을 보장함.
			System.out.println("다시 실행하세요!");
		}
	}

}
