package javaexp.a13_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A08_Reader {

	public static void main(String[] args) {

		// ex) z04_data.txt 생성, 좋아하는 음악 가사 삽입.
		// A08_Reader.java 통해서 가사 출력
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		Reader r1 = null;
		File f01 = new File(path + "z04_data.txt");
		try {
			f01.createNewFile();
			r1 = new FileReader(path + "z04_data.txt");
			while(true) {
				int txt = r1.read();
				if(txt == -1 ) {
					break;
				}
				System.out.print((char)txt);
			}
			System.out.println("\n내용 읽어 오기 끝");
		} catch (FileNotFoundException e) {			System.out.println("\n내용 읽어 오기 끝");
		} catch(IOException e) {
			System.out.println("\n내용 읽어 오기 끝");		} catch (Exception e) {
			System.out.println("기타 예외 " + e.getMessage());
		} finally {
			if(r1 != null) {
				// reader 객체가 메모리에 있을 때, 최종으로 자원 해제
				try {
					r1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("-- 최종 자원 해제 --");
			}
		}
	}

}



