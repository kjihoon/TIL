package day8;
import java.io.File;
import java.util.*;
public class FileTest {

	public static void main(String[] args) {
		//점검하려는 파일명이나 디렉토리명을 표준입력
		//으로 받아 처리하도록 소스 수정 - Scanner
		Scanner scanner = new Scanner(System.in);
		String pathname = "C:/Users/student/eclipse-workspace/practice_day1/src/";
		String filename = scanner.nextLine();
		
		File f = new File(pathname+filename);
		

		
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("디렉토리 입니다");
			}else {
				System.out.println(f.length()+"byte 파일입니다.");
			}
		}else {
			System.out.println("존재하지 않는다!");
		}		
	}
}
