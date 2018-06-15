package day14;


import java.io.*;
import java.util.*;
public class SerialTest1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream ("c:/iotest/test1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Date());
		Thread.sleep(3000);
		oos.writeObject(new Date());
		oos.close();
		fos.close();
		System.out.println("직렬화 출력 성공");
	}

}
