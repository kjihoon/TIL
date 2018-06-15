package day15;
import java.net.*;
import java.io.*;

public class TcpIpClient {

	public static void main(String[] args) {
		try{
			String serverIp = "70.12.114.91";
			System.out.println("서버와 연결중 서버IP :"+serverIp);
			Socket socket = new Socket(serverIp,7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로 받은 메세지:"+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		}catch(ConnectException ce){
			ce.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
