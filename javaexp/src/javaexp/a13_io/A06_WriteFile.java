package javaexp.a13_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class A06_WriteFile {

	public static void main(String[] args) {
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		Writer fout = null;
		try {
			fout = new FileWriter(path + "z02_data.txt", true);
			System.out.println("파일에 쓸 내용 입력");
			Scanner sc = new Scanner(System.in);
			String data = sc.nextLine();
			fout.write("기존 내용"); // write 메서드 안 내용으로 바로 내용 삽입됨
//			fout.append("\n" + data + "\n"); // 누적 저장(기존 내용 + 신규 내용)
			fout.flush(); // 버퍼에 있는 임시 메모리 비워주기
			System.out.println("입력 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fout.close(); // 자원 해제				
			} catch(IOException e) {
				
			}
		}

	}

}
