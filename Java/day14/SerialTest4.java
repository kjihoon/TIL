package day14;


import java.io.*;
import java.util.*;

public class SerialTest4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream ("c:/iotest/test2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Date value1 = (Date) ois.readObject();
		Date value2 = (Date) ois.readObject();
		Student st = (Student)ois.readObject();
		System.out.println("Date ��ü ������:"+value1);
		System.out.println("Date ��ü ������:"+value2);
		System.out.println("Student ��ü ������:"+st);
		st.study();
		ois.close();
		fis.close();
	}

}
