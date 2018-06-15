package day13;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("C:/iotest/output2.txt")){
			int data;
			while (true){
				data = reader.read();
				if (data==-1){  //���̻� ������ ������ -1�� �ٲ�
					break;
				}
				System.out.print((char)data);
			}
		}catch (FileNotFoundException fnfe){
			System.out.println("���� ���� xx");
		}catch (IOException ioe){
			System.out.println("���� �б� xx");
		}
	}

}
