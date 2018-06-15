package day13;

import java.io.*;
public class FileWriterTest2 {

	public static void main(String[] args) {

		try(FileWriter writer = new FileWriter("C:/iotest/output2.txt")){
			char arr [] = {'��','ü','��','��','��','��','J','A','B','A'};
			for (int cnt =0;cnt<arr.length;cnt++){
				writer.write(arr[cnt]);
			}
	
			writer.write("\n");
			writer.write(arr);
			
			writer.write("\n");
			writer.write("OCJP ������");
			writer.write("\n");
			//
			System.out.println("���� ��� �Ϸ�");			
			}catch(IOException ioe){
				System.out.println("���Ϸ� ��� �� �� �����ϴ�.");
			}
	}
}
