package javaexp.a13_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A09_NIO {

	public static void main(String[] args) {
		String path = "E:\\a01_javaexp\\workspace_Bootcamp\\javaexp\\src\\javaexp\\a13_io\\";
		String fname1 = path + "z05_data.txt";
		File f01 = new File(fname1);
		try {
			if(!f01.exists()) { // 파일이 존재하지 않으면 생성
				f01.createNewFile();
			}
			// 새로운 파일을 처리하는 객체
			Path filPath = Paths.get(fname1);
			File f02 = filPath.toFile(); // 파일 객체로 변환
			System.out.println(f02.getName()); // 파일 이름
			System.out.println(f02.getPath()); // 파일 경로
			System.out.println(f02.exists()); // 파일 존재 여부 boolean
			System.out.println(f02.length()); // 파일 길이?
			
			
		} catch (IOException e) {
				System.out.println(e.getMessage());
		}
		
		// ex) File 객체를 f03으로 z06_data.txt 로 만들고 이름 Path에 의해 객체로 만들었다가
		// 다시 f04를 참조값으로 하는 파일 객체로 만들고 파일 정보와 경로 정보를 가져올 것.
		File f03 = new File(path + "z06_data.txt");
		try {
			if(!f03.exists()) {
				f03.createNewFile();				
			}
			Path pa2 = Paths.get(path + "z06_data.txt");
			File f04 = pa2.toFile();
			System.out.println(f04.getName());
			System.out.println(f04.getPath());
			System.out.println(f04.exists());
			System.out.println(f04.length());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
