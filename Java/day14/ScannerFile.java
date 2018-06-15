package day14;
import java.io.*;
import java.net.*;
import java.util.*;
public class ScannerFile {

	public static void main(String[] args) throws Exception{
		File file = new File("c:/iotest/data.txt");
		Scanner sc =new Scanner(file);
		int sum= 0;
		int cnt= 0;
		while (sc.hasNextInt()){
			sum +=sc.nextInt();
			cnt++;
		}
		System.out.println("sum = "+sum);
		System.out.printf("average = %.2f",(double)sum/cnt);
	}

}
