package day14;


import java.io.*;
import java.util.*;
public class SerialTest3 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream ("c:/iotest/test2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Date());
		Thread.sleep(3000);
		oos.writeObject(new Date());
		
		Student st = new Student ("Duke",23,"java프로그래밍");
		oos.writeObject(st);
		oos.close();
		fos.close();
		System.out.println("직렬화 출력 성공");
	}

}
