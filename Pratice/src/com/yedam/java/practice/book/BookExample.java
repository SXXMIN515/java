package com.yedam.java.practice.book;

import java.util.Scanner;

public class BookExample {

	public static void main(String[] args) {
		boolean run = true;
		int count = 0;
		Book[] bookList = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.print("도서 수> ");
				count = Integer.parseInt(sc.nextLine());
				bookList = new Book[count];			
			} else if(menu == 2) {
				for(int i=0; i<count; i++) {
					System.out.printf("%d번째 도서 정보 입력\n", i+1);
					System.out.print("도서번호> ");
					int bookNum = Integer.parseInt(sc.nextLine());
					System.out.print("도서제목> ");
					String title = sc.nextLine();
					System.out.print("도서가격> ");
					int price = Integer.parseInt(sc.nextLine());
					
					Book book = new Book(bookNum, title, price);
					
					bookList[i] = book;
				}
			} else if(menu == 3) {
				for(int i=0; i<count; i++) {
					Book book = bookList[i];
					book.showInfo();				
				}
			} else if(menu == 4) {
				BookAnalysis maxPrice = new BookAnalysis(0, bookList[0].getPrice());
				BookAnalysis minPrice = new BookAnalysis(0, bookList[0].getPrice());
				double avgPrice = 0;
				double sum = 0;
				
				for(int i=0; i<count; i++) {
					Book book = bookList[i];
					
					if(maxPrice.getPrice() < bookList[i].getPrice()) {
						maxPrice.setIdx(i);
					}
					if(minPrice.getPrice() > bookList[i].getPrice()) {
						minPrice.setIdx(i);
					}
					
					sum += book.getPrice();
				}
				
				avgPrice = sum/count; 
				System.out.printf("최고 가격 : %d원\n", bookList[maxPrice.getIdx()].getPrice());
				System.out.printf("최저 가격 : %d원\n", bookList[minPrice.getIdx()].getPrice());
				System.out.printf("평균 가격은 %.2f원 입니다.\n", avgPrice);
			} else if(menu == 5) {
				run = false;
			}

		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
