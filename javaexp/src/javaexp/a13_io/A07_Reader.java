package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A07_Reader {

	public static void main(String[] args) {
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		Reader reader = null;
		try {
			reader = new FileReader(path + "z01_data.txt");
			while(true) { // 해당 파일의 모든 글자를 불러오기 위해 반복문 사용(글자 하나씩 가져오기 때문)
				int code = reader.read(); // 한 글자씩 코드값을 가져옴.
				if(code == -1) { // 불러 올 데이터가 없을 경우 char코드가 -1이 됨, 이때 반복 종료.
					break;
				}
				System.out.print((char)code);
			}
			reader.close();
			System.out.println("\n읽기 종료");
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 읽을 수 없음");
		}
		catch (IOException e) { // <- int code = reader.read(); 해당 라인 에러
			System.out.println("해당 파일을 읽을 수 없음");
			System.out.println(e.getMessage());
		}
	}
	

}
