package day13;

import java.io.*;
public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter writer =null;
		String path ="C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()){
			isDir.mkdirs();
		}
		try{
			writer =new FileWriter ("c:/iotest/ouput.txt",true);// boolean을 생략하면 새롭게 저장 아니면 업데이트
			char arr [] = {'객','체','지','향','언','어','J','A','B','A'};
			for (int cnt =0;cnt<arr.length;cnt++){
				writer.write(arr[cnt]);
			}
			//위와 동일
			writer.write("\r\n"); // 윈도우에서 \n과 동일
			writer.write(arr);
			//
			writer.write("\r\n");
			writer.write("OCJP 시험대비");
			writer.write("\r\n");
			//
			System.out.println("파일 출력 완료");			
			}catch(IOException ioe){
				System.out.println("파일로 출력 할 수 없습니다.");
			}finally{  //이렇든 저렇든 수행해야하는 블럭
				try{
					if (writer!= null) //writer에는 오류 처리가 있기 때문에 한번 더 써줘야한다.. 융통성없음
						writer.close(); // 습관처럼  .close() 사용하자!!!!
				}catch(Exception e){
					System.out.println("파일 닫기오류");
								
			}
		}
	}
}
