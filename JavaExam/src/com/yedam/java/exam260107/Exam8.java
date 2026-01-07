package com.yedam.java.exam260107;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				System.out.print("예금액 : ");
				int in = Integer.parseInt(sc.nextLine());
				balance += in;
			} else if (menu == 2) {
				System.out.print("출금액 : "); 
				int out = Integer.parseInt(sc.nextLine());
				
				if(balance < out) {
					System.out.println("잔액이 부족합니다!");
					System.out.printf("출금 가능액 : %d원\n", balance);
				} else {
					balance -= out;
				}
			} else if (menu == 3) {
				System.out.printf("현재 잔액 : %d원\n", balance);
			} else if (menu == 4) {
				run = false;
			}
		}
		
		System.out.println("이용해 주셔서 감사합니다!");
		sc.close();
	}

}
