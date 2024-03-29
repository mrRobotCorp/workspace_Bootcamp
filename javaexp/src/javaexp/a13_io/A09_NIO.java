package javaexp.a13_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
			Path pa2 = Paths.get(path + "z06_data.txt"); // 파일 객체 생성(위에서 생성한 파일을 객체 처리)
			File f04 = pa2.toFile(); // f03파일을 객체화하여 f04로 참조값 설정
			System.out.println(f04.getName()); // 파일 객체 f04(f03)의 이름 불러오기
			System.out.println(f04.getPath());
			System.out.println(f04.exists());
			System.out.println(f04.length());
			// 파일 삭제 처리
			Files.delete(pa2); // z06_data.txt 삭제됨
			// 복사 할 원본 파일 : pa2
			// 복사 할 대상 파일 : copPath
			Path copPath = Paths.get(path + "z10_data.txt");
			// 복사 처리 Files.copy() <- 파일 대용량 카피에 용의
			Files.copy(pa2, copPath, StandardCopyOption.REPLACE_EXISTING);
			
			// ex) 현재 폴더 하위에 a10_fold 폴더 생성. 그 하위에 z10_data.txt 를 복사한 
			// a01_data.txt - a09_data.txt 생성
			
			File ffold = new File(path + "a10_fold");
			ffold.mkdir();
			
			for(int i=1; i<=9; i++) {
				Path copPath2 = Paths.get(path + "a10_fold\\a0" + i + "_data.txt");
				File ftxt = new File(path + "a10_fold\\a0" + i + "_data.txt");
				Files.copy(copPath, copPath2, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
