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
			writer =new FileWriter ("c:/iotest/ouput.txt",true);// boolean�� �����ϸ� ���Ӱ� ���� �ƴϸ� ������Ʈ
			char arr [] = {'��','ü','��','��','��','��','J','A','B','A'};
			for (int cnt =0;cnt<arr.length;cnt++){
				writer.write(arr[cnt]);
			}
			//���� ����
			writer.write("\r\n"); // �����쿡�� \n�� ����
			writer.write(arr);
			//
			writer.write("\r\n");
			writer.write("OCJP ������");
			writer.write("\r\n");
			//
			System.out.println("���� ��� �Ϸ�");			
			}catch(IOException ioe){
				System.out.println("���Ϸ� ��� �� �� �����ϴ�.");
			}finally{  //�̷��� ������ �����ؾ��ϴ� ��
				try{
					if (writer!= null) //writer���� ���� ó���� �ֱ� ������ �ѹ� �� ������Ѵ�.. ���뼺����
						writer.close(); // ����ó��  .close() �������!!!!
				}catch(Exception e){
					System.out.println("���� �ݱ����");
								
			}
		}
	}
}
