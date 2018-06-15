package day14;
import java.util.*;
import java.net.*;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
public class ReadWeb {

	public static void main(String[] args) {
		FileWriter writer =null;
		String path ="C:/iotest/output";
		File isDir = new File(path); //존재여부,사이즈 등 주로 체크 용도임, I/O 기능은 갖추지않았다
		if (!isDir.exists()){
			isDir.mkdirs();
		}
		Scanner sc = new Scanner (System.in);
		String url = sc.nextLine();
		String sp [] = url.split("/");
		String filename = sp[sp.length-1];
		String extension [] =filename.split("html");
		
		try{
			
			URL req= new URL(url);
			
			InputStream is = req.openStream();// day15 urlconnection 과 비교 하기 (.openConnection())
			
			if (extension.equals(filename)==false){
				
				
				PrintWriter out = new PrintWriter(path+"/"+filename,"UTF-8"); 
				
				int input = 0;
				while (true) {
					input = is.read();
					if (input == -1)
						break;
					out.write(input);
				}
				out.close();
			}else{
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
			}
			System.out.println("성공!");
			sc.close();		
		}catch(MalformedURLException e){
			System.out.println("URL문자열 오류"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO오류:"+e.getMessage());
		}
	}
}
