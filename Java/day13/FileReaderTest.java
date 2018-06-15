package day13;
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("C:/iotest/output2.txt")){
			int data;
			while (true){
				data = reader.read();
				if (data==-1){  //더이상 읽을게 없을때 -1로 바뀜
					break;
				}
				System.out.print((char)data);
			}
		}catch (FileNotFoundException fnfe){
			System.out.println("파일 존재 xx");
		}catch (IOException ioe){
			System.out.println("파일 읽기 xx");
		}
	}

}
