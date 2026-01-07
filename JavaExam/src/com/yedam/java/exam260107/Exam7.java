package com.yedam.java.exam260107;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 50) + 1;
		
		while(isStop) {
			System.out.print("숫자입력 : ");
			int userNum = Integer.parseInt(sc.nextLine());
			
			if(randomNum > userNum) {
				System.out.println("up하세요!!");
			} else if(randomNum < userNum) {
				System.out.println("down하세요!!");
			} else if(randomNum == userNum) {
				isStop = false;
			}
		}
		
		System.out.println("축하합니다!!");
		sc.close();
	}

}
