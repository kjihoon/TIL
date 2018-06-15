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
			//URL객체를 생성해도 서버에 요청을 보내지는 않는다, OpenStream을 할때 서버요청
			URL u = new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");
			//오픈 스트림은 html 의 바디만 읽지만 오픈커넥션 type정보 등 많이 읽음
			URLConnection uc = u.openConnection();
			
			//내용추출
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
