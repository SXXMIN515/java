package com.yedam.java.ch1401.character;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test3.txt");
		
		char[] buffer = new char[10];
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) break;
			String str = new String(buffer);
			System.out.println(str);
		}
		reader.close();
	}

}
