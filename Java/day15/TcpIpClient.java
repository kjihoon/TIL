package day15;
import java.net.*;
import java.io.*;

public class TcpIpClient {

	public static void main(String[] args) {
		try{
			String serverIp = "70.12.114.91";
			System.out.println("������ ������ ����IP :"+serverIp);
			Socket socket = new Socket(serverIp,7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("������ ���� �޼���:"+dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		}catch(ConnectException ce){
			ce.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
