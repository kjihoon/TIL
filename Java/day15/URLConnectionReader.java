package day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;

public class URLConnectionReader {

	public static void main(String[] args) {
		try{
			//URL��ü�� �����ص� ������ ��û�� �������� �ʴ´�, OpenStream�� �Ҷ� ������û
			URL u = new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");
			//���� ��Ʈ���� html �� �ٵ� ������ ����Ŀ�ؼ� type���� �� ���� ����
			URLConnection uc = u.openConnection();
			
			//��������
			InputStream is = (InputStream) uc.getContent();
			BufferedReader in =new BufferedReader(new InputStreamReader(is,"UTF-8"));
			
			String inputLine;
			
			while ((inputLine = in.readLine())!=null)
				System.out.println(inputLine);			
			
			System.out.println("Content-type:"+uc.getContentType());
			System.out.println("Date:"+new java.util.Date(uc.getDate()));
			System.out.println("Content_length:"+uc.getContentLength());
			
		}catch(MalformedURLException e){
			System.out.println("URL is not a URL I understand");
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
