package day02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Http$http2 {

	public static void main(String[] args) throws Exception{
		String name = "����";
		name = URLEncoder.encode(name,"utf-8");
		String surl ="http://127.0.0.1/Study/Login?id=qq&pwd=11&name="+name;
		
	
		URL url = new URL(surl);
		URLConnection con = url.openConnection();
		con.setConnectTimeout(5000);
		
		InputStream in = con.getInputStream();
		InputStreamReader ir = new InputStreamReader(in,"utf-8");
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		
		System.out.println(str);
		br.close();
		
		
		
	}

}
