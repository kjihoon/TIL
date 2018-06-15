package tcp5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;



public class Server {
   private int port =9999;
   ServerSocket serverSocket;
   Socket socket = null;
   boolean flag = true;
   
   ArrayList<DataOutputStream> list = new ArrayList<>();
   //HashMap<String, DataOutputStream> hm;

   //server ���� ����
   public Server() throws IOException {
      serverSocket = new ServerSocket(port);
      System.out.println("Server Ready...");
   }
   
   //client acceptó�� - while loop
   public void start() throws IOException {
      while(flag) {
         System.out.println("Waiting client");
         socket= serverSocket.accept();
         System.out.println("Connect : "+serverSocket.getInetAddress());
         //socket ���� Receiver �ʿ�
         new Receiver(socket).start();
      }
   }
   
   public static void main(String[] args) {
      Server server = null;
      try {
         server = new Server();
         server.start();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   //
   class Receiver extends Thread{
      InputStream is;
      DataInputStream dis;
      OutputStream os;
      DataOutputStream dos;
      
      public Receiver(Socket socket) throws IOException {
         // socket ���� ���ο� input/output stream�� ��������� ������ ������ ��ġ�� �ʴ´�.
         is = socket.getInputStream();
         dis = new DataInputStream(is);
         os = socket.getOutputStream();
         dos = new DataOutputStream(os);
         //����� Arraylist�� �߰�
         list.add(dos);
         //����� ��
         System.out.println("Client count : "+list.size());
         
         
      }
      @Override
      public void run() {
         while(dis != null) {
            String msg=null;
            try {
               msg = dis.readUTF();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            if(msg.equals("q")) {
               break;
            }
            System.out.println(msg);
            //send Spring server
            SendHttp http = new SendHttp(msg);
            http.start();
         }
         list.remove(dos);
         if(dos != null) {
            try {
               dos.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         if(dis != null) {
            try {
               dis.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      }
   }
   
   class SendHttp extends Thread {
      String msg;
      String urls = "http://127.0.0.1/ws/main.do";
      public SendHttp(String msg) {
         this.msg = msg;
      }
      @Override
      public void run() {
    	  urls += "?speed="+msg;
         System.out.println(urls);
         try {
            URL url = new URL(urls);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(5000);
            conn.getInputStream();
         } catch (Exception e) {
        	 System.out.println("Http Error");
            e.printStackTrace();
         }
      }
   }
   
/*   
   class sendToWeb extends Thread {
	      String msg;
	      String urls = "http://127.0.0.1/ws/main.do?";
	      public sendToWeb(String msg) {
	         this.msg = msg;
	      }
	      @Override
	      public void run() {
	         urls += msg;
	         try {
	            URL url = new URL(urls);
	            HttpURLConnection con = (HttpURLConnection) url.openConnection();
	            con.setRequestMethod("POST");
	            con.setConnectTimeout(5000);
	            con.getInputStream();
	         }
	         catch(Exception e) {
	            System.out.println("HTTP ERROR");
	            e.printStackTrace();
	         }
	      }
	      
	   }*/
}
