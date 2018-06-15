package day14;
import java.util.*;
import java.net.*;
import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
public class URLLab {

	public static void main(String[] args) {
		FileWriter writer =null;
		String path ="C:/iotest/output";
		File isDir = new File(path);
		if (!isDir.exists()){
			isDir.mkdirs();
		}		
		Scanner sc = new Scanner (System.in);
		String url = sc.nextLine();
		String sp [] = url.split("/");
		String filename = sp[sp.length-1];
		
		
		try{
			URL req= new URL(url);
			InputStream is = req.openStream();
			String imageName= "c:/iotest/output/"+filename;
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
			System.out.println("성공!");
		
					
		}catch(MalformedURLException e){
			System.out.println("URL문자열 오류"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO오류:"+e.getMessage());
		}
	}

}
