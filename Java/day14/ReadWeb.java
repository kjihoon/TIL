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
		File isDir = new File(path); //���翩��,������ �� �ַ� üũ �뵵��, I/O ����� �������ʾҴ�
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
			
			InputStream is = req.openStream();// day15 urlconnection �� �� �ϱ� (.openConnection())
			
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
			System.out.println("����!");
			sc.close();		
		}catch(MalformedURLException e){
			System.out.println("URL���ڿ� ����"+e.getMessage());
		}catch(IOException e){
			System.out.println("IO����:"+e.getMessage());
		}
	}
}
