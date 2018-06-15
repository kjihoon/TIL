package day13;

import java.io.*;
public class FileWriterTest2 {

	public static void main(String[] args) {

		try(FileWriter writer = new FileWriter("C:/iotest/output2.txt")){
			char arr [] = {'객','체','지','향','언','어','J','A','B','A'};
			for (int cnt =0;cnt<arr.length;cnt++){
				writer.write(arr[cnt]);
			}
	
			writer.write("\n");
			writer.write(arr);
			
			writer.write("\n");
			writer.write("OCJP 시험대비");
			writer.write("\n");
			//
			System.out.println("파일 출력 완료");			
			}catch(IOException ioe){
				System.out.println("파일로 출력 할 수 없습니다.");
			}
	}
}
