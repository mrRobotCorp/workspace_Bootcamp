package javaexp.a13_io;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_Stream {

	public static void main(String[] args) {

		// ex) A02_Stream.java 생성. 
		// 정답 번호 입력, 입력된 정답 번호##, 정답 여부 : @@
		
		System.out.println("Q. 뭐뭐뭐뭐?");
		System.out.println("1. ##  2.##  3.##  4.##");
		InputStream ans = System.in;
		
		try {
			int num = ans.read();
			// is.read(byte[] bytes) : 여러개의 문자을 입력 받음
			// bytes : 입력된 문자의 배열을 코드값으로 배열에 저장
			// new String(bytes) : 여러 개의 문자열 데이터를 확인
			OutputStream ops = System.out;
			System.out.print("입력된 정답 번호 : ");
			ops.write(num); // 입력한 input 값을 output write 메서드에 넣어 출력
			ops.flush();
			char corChar = '2';
			char inputChar = (char)num;
			System.out.println("\n정답 : " + corChar + " 번");
			System.out.print("정답 여부 : " + (corChar == inputChar)); // true or false 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}