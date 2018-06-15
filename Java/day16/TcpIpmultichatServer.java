package day16;
import java.net.*;
import java.util.*;
import java.io.*;


public class TcpIpmultichatServer {
	HashMap <String, DataOutputStream> clients;
	
	TcpIpmultichatServer(){
		clients = new HashMap<String, DataOutputStream>();
		Collections.synchronizedMap(clients);
		}
	public void start(){
		ServerSocket serverSocket =null;
		Socket socket = null;
		try{
			serverSocket = new ServerSocket(7777);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			
			while(true){
				socket = serverSocket.accept();
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ������");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		}catch(Exception e ){
			e.printStackTrace();
		}
	}
	void sendToAll(String msg){
		Iterator<String> it = clients.keySet().iterator();
		
		while(it.hasNext()){
			try{
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			}catch(IOException e){}
		}
	}
	public static void main(String[] args) {
		new TcpIpmultichatServer().start();
	}
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.socket=socket;
			try{
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			}catch(IOException e){}
		}
		public void run(){
			String name = "";
			try{
				name = in.readUTF();
				sendToAll("#"+name+"���� ��� ���̽��ϴ�.");
				
				clients.put(name, out);
				System.out.println("���� ���������� ����"+clients.size()+"�Դϴ� ����");
				while(in!=null){
					sendToAll(in.readUTF());
				}
			}catch (IOException e){
				
			}finally{
				sendToAll("#"+name+"���� �������");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ������ ������");
				System.out.println("���� ���������� ����"+clients.size()+"�Դϴ�.");
			}
		}
	}
	
}
