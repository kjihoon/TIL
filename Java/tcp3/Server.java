package tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;




public class Server {
	
	int port;
	ServerSocket serverSocket;
	boolean flag = true;
	Socket socket = null;
	public Server() throws IOException {
	      port = 7777;
	      serverSocket = new ServerSocket(port); // ��ǻ���� Ư�� ��Ʈ�� �����Ͽ� ���������� �� ���̴�. //�ٸ� ���α׷��� ����ϰ� ���� ���� ���� ó��
	}
	public void startServer() throws IOException {
	      
	      System.out.println("Start Server....");
	      while(flag) {
	         Socket socket = null;
	         System.out.println("Ready Server....");
	         socket = serverSocket.accept();
	         
	         RecieverAndSender s = new RecieverAndSender(socket);
	         Thread t = new Thread(s);
	         t.start();
	         System.out.println("Accepted.... Client"+socket.getInetAddress());
	         
	      }
	      System.out.println("End Server....");
	   }
	
	public static void main(String [] args) {

		Server server = null;
	      try {
	         server = new Server();
	         server.startServer();
	      } catch (IOException e) {
	         
	      }
	}
	
	
	
	//RecieverAndSender class
	
	public class RecieverAndSender implements Runnable{
		
		OutputStream out;
		OutputStreamWriter outw;
		Socket socket;
		
		
		InputStream in;
		InputStreamReader inr;	
		BufferedReader br;
		
		
		
		
		public RecieverAndSender() {}
		public RecieverAndSender(Socket socket) throws IOException {
			this.socket = socket;
			 out = socket.getOutputStream();
		     outw = new OutputStreamWriter(out);
		}
			
		@Override
		public void run() {
			try {
		          Thread.sleep(3000);
		          outw.write("�ȳ�");
		          
		          in = socket.getInputStream();					
		          inr = new InputStreamReader(in);
		          br= new BufferedReader(inr);
		          String str = br.readLine();
		          System.out.println("Clientmsg:"+str);	
		          
		          
		          
		       } catch (Exception e) {
		          // TODO Auto-generated catch block
		          e.printStackTrace();
		       } finally {
		          if(outw != null) {
		             try {
		                outw.close();
		             } catch (IOException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		             }
		          }
		          if(socket != null) {
		             try {
		                socket.close();
		             } catch (IOException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		             }
		          }
		       }
		}
		
	}
	
	
}
