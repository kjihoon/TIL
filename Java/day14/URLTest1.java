package day14;
import java.net.*;
import java.io.*;
public class URLTest1 {

	public static void main(String[] args) {
		try{
			URL req= new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1162058500");
			InputStream is = req.openStream();//URL ���ڸ� �м��Ͽ� ������ �м� �� ���Ͽ�û!!!(InputStream��ü ����)
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
			System.out.println("URL���ڿ� ����"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO����:"+e.getMessage());
		}
	}
}
