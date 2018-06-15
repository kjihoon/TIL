package day13;
import java.io.*;
public class FileReaderTest2 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("C:/iotest/output2.txt");
				BufferedReader br = new BufferedReader(reader);){
			// readLine�� ����ϱ� ���� ó��@@
			String data;
			while (true){
				data = br.readLine();
				if (data==null){  //���̻� ������ ������ null�� �ٲ�
					break;
				}
				System.out.println(data);
			}
		}catch (FileNotFoundException fnfe){
			System.out.println("���� ���� xx");
		}catch (IOException ioe){
			System.out.println("���� �б� xx");
		}
	}

}
