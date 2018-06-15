package day14;

import java.net.*;
import java.io.*;
public class URLTest2 {

	public static void main(String[] args) {
		try{
			URL req= new URL(" http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is = req.openStream();
			String imageName= "c:/iotest/duke.jpg";
			FileOutputStream fos = new FileOutputStream(imageName);
			
			int input=0;
			while(true){
				input = is.read();
				if (input ==-1){
					break;
				}
				fos.write(input);
			}
			fos.close();
			System.out.println("����!");
		
					
		}catch(MalformedURLException e){
			System.out.println("URL���ڿ� ����"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO����:"+e.getMessage());
		}
	}
}
