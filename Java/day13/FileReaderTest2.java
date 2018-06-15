package day13;
import java.io.*;
public class FileReaderTest2 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("C:/iotest/output2.txt");
				BufferedReader br = new BufferedReader(reader);){
			// readLine을 사용하기 위한 처리@@
			String data;
			while (true){
				data = br.readLine();
				if (data==null){  //더이상 읽을게 없을때 null로 바뀜
					break;
				}
				System.out.println(data);
			}
		}catch (FileNotFoundException fnfe){
			System.out.println("파일 존재 xx");
		}catch (IOException ioe){
			System.out.println("파일 읽기 xx");
		}
	}

}
