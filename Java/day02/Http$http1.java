package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Http$http1 {

	public static void main(String[] args) {
		/*InetAddress ia = null;
		ia = InetAddress.getByName("localhost");
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		*/
		
		URL url = null;
		String address = "http://www.naver.com";
		try {
			url = new URL(address);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		InputStreamReader in =null; //1 �ܾ� ���� read
		
		BufferedReader br = null;  //1 line ���� read
		String str = null;
		StringBuffer sb = new StringBuffer(); //��� �ٲܼ� �ִ� string
		
		try {
			in = new InputStreamReader(url.openStream());
			br = new BufferedReader(in);
			while(true) {
				str = br.readLine();
				if (str ==null) {
					break;
				}
				sb.append(str+"\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
