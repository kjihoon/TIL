package day15;
import java.net.*;
import java.io.*;

public class TcpIpClient2 {

	public static void main(String[] args) {
		
		try{
			String serverIp = "70.12.114.107";
			System.out.println("������ ������ ����IP :"+serverIp);
			Socket socket = new Socket(serverIp,7777);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			//Sender sender = new Sender(socket);
			//Receiver receiver = new Receiver(socket);
			
			/*sender.start();
			receiver.start();*/
			
		}catch(ConnectException ce){
			ce.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
