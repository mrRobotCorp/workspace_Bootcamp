package javaexp.a13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A01_Stream {

	public static void main(String[] args) {
		System.out.println("-- 기본 입력 문자 처리 --");
		System.out.print("문자 1자를 입력 : ");
		InputStream is01 = System.in;
		
		try {
			int data = is01.read();
			OutputStream os01 = System.out;
			System.out.print("입력 내용 : ");
			os01.write(data); // write(byte) : 코드 값을 출력
			os01.flush(); // 임시 메모리

			char c01 = (char)data;
			System.out.println("\n입력 내용2 : " + c01);
			os01.close(); // 자원 해제
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
