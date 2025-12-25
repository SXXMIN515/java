package com.yedam.java.ch0402;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			
			String choice = scanner.nextLine();
			
			switch(choice) {
			case "1":
				System.out.print("예금액> ");
				int result = Integer.parseInt(scanner.nextLine());
				balance += result;
				break;
			case "2":
				System.out.print("출금액> ");
				result = Integer.parseInt(scanner.nextLine());
				if(balance > result) {
					balance -= result;					
				} else {
					System.out.println("잔고보다 출금액이 많습니다.");
				}
				break;
			case "3":
				System.out.printf("잔고> %d\n", balance);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
			}
			
//			int in = 0;
//			int out = 0;
//			if (choice.equals("1")) {
//				System.out.print("예금액> ");
//				in = Integer.parseInt(scanner.nextLine());
//				balance += in;
//			} else if (choice.equals("2")) {
//				System.out.print("출금액> ");
//				out = Integer.parseInt(scanner.nextLine());
//			    if(balance > out) {
//			    	balance -= out;					
//			    } else {
//			    	System.out.println("잔고보다 출금액이 많습니다.");
//			    }
//			} else if (choice.equals("3")) {
//				System.out.println("잔고> " + balance);
//			} else if (choice.equals("4")) {
//				run = false;
//				break;
//			} 
			
		}
		
		System.out.println("");
		
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
