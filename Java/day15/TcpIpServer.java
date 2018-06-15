package day15;
import java.util.*;
import java.net.*;
import java.io.*;
import java.text.*;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket svsocket = null;
		try{
			svsocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었음");
		}catch(IOException e){
			e.printStackTrace();
		}
		while (true){
			try{
				System.out.println(getTime()+"연결 요청중");
				Socket socket = svsocket.accept();
				System.out.println(getTime()+socket.getInetAddress());
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Hi");
				System.out.println(getTime()+"데이터를 전송합니다.");
				
				dos.close();
				socket.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	static String getTime(){
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
