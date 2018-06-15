import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.*;
public class Study1 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
		String path= "C:/iotest";
		File isDir = new File(path);
		if (isDir.exists()){
			isDir.mkdirs();
		}
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		String sp [] = url.split("/");
		String filename = sp[sp.length-1];
		String ext [] = filename.split("html");
		String extension = ext[0];
		System.out.println(extension);
		try{
			URL req = new URL(url);
			InputStream is= req.openStream();
			if (extension.equals(filename)){
				FileOutputStream fos = new FileOutputStream(path+"/"+filename);
				int input =0;
				while(true){
					input = is.read();
					if (input ==-1){
						break;
					}
				}
			}else{
				PrintWriter out = new PrintWriter(path+"/"+filename);
				int input =0;
				while (true){
					input = is.read();
					if (input ==-1){
						break;
					}
					out.write(input);
				}
			}
		}catch (Exception e){
			System.out.println("¿À·ù:"+e.getMessage());
		}
		
		
		
	}
		
}
