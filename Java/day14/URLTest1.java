package day14;
import java.net.*;
import java.io.*;
public class URLTest1 {

	public static void main(String[] args) {
		try{
			URL req= new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1162058500");
			InputStream is = req.openStream();//URL 문자를 분석하여 웹서버 분석 후 파일요청!!!(InputStream객체 리턴)
			InputStreamReader isr =new InputStreamReader(is,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String data;

			while(true){
				data = br.readLine();
				if (data == null)
					break;
				System.out.print(data+"\n");
				
			}
			is.close();
			
		}catch(MalformedURLException e){
			System.out.println("URL문자열 오류"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO오류:"+e.getMessage());
		}
	}
}
