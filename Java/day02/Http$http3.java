package day02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Http$http3 {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://127.0.0.1/Study/playground.zip");
		InputStream in = url.openStream();
		FileOutputStream fout = new FileOutputStream("down.zip");
		
		
		int i =0;
		while(true) {
			i = in.read();
			System.out.println(i);
			if (i == -1) { //file¿« ≥°¿∫ -1
				break;
			}
			fout.write(i);
		}
		in.close();
		fout.close();
	}

}
