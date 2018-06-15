package day04_tcp6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Server extends Thread {

   ServerSocket serverSocket;
   boolean flag = true;
   boolean rflag = true;
   
   ArrayList<DataOutputStream> list = new ArrayList<>();

   public Server() throws IOException {
      // Create ServerSocket
      serverSocket = new ServerSocket(8888);
      System.out.println("Ready Server...");

   }

   @Override
   public void run() {
      // Accept Client Connection
      try {
         while (flag) {
            System.out.println("Ready Accept");
            Socket socket = serverSocket.accept();
            new Receiver(socket).start();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   class Receiver extends Thread {      // 데이터를 인풋스트림으로 받아야한다.
      InputStream in;
      DataInputStream din;
      OutputStream out;
      DataOutputStream dout;
      Socket socket;

      public Receiver(Socket socket) {
         try {
            this.socket = socket;
            in = socket.getInputStream();
            din = new DataInputStream(in);
            out = socket.getOutputStream();
            dout = new DataOutputStream(out);
            list.add(dout);
            System.out.println("Connected Count : " + list.size());
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }

      @Override
      public void run() {
         try {
            while(rflag) {
               if(socket.isConnected() && din != null && din.available() > 0) {
                  String str = din.readUTF();
                  if(str != null && str.equals("q")) {
                     list.remove(dout);
                     System.out.println(list.size());
                     break;
                  }
                  System.out.println(str);
                  sendAll(socket.getInetAddress(),str);
               }
            }
            
         }catch(Exception e) {
            e.printStackTrace();
         }finally {
            
            try {
               Thread.sleep(200);
            } catch (InterruptedException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
            
            if(dout != null) {
               try {
                  dout.close();
               } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
            if(din != null) {
               try {
                  din.close();
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
   
   public void sendAll(InetAddress inetAddress, String msg) {
      Sender sender= new Sender();
      sender.setMsg(inetAddress,msg);
      sender.start();
   }
   
   // Send Message All Clients
   class Sender extends Thread {
      
      String msg;
      String ip;
      HashMap<String,String> map;
      
      public void setMsg(InetAddress inetAddress, String msg) {
    	  
    	 map = new HashMap<>();
    	 map.put(ip, "jihoon");
         this.ip = inetAddress.getHostAddress();
         this.msg = msg;       
      }
      
      /*public HashMap getName(String ip) {
    	  HashMap<String,String> map = new HashMap<>();
    	  map.put("70.12.114.131", "eri");
    	  map.put("70.12.114.132", "juna");
    	  map.put("70.12.114.133", "hojin");
    	  map.put("70.12.114.134", "moo");
    	  map.put("70.12.114.135", "woo");
    	  map.put("70.12.114.136", "dahae");
    	  map.put("70.12.114.137", "jihoon");
    	  map.put("70.12.114.138", "won");
    	  map.put("70.12.114.139", "sang");
    	  map.put("70.12.114.140", "hihi");
    	  map.put("70.12.114.141", "ho");
    	  map.put("70.12.114.142", "i-rin");
    	  map.put("70.12.114.143", "yh");
    	  map.put("70.12.114.144", "yh");
    	  map.put("70.12.114.145", "yh");
    	  return map;
      }*/
      
      
      @Override
      public void run() {
         try {
            if(!list.isEmpty() && list.size() > 0) {
               for(DataOutputStream dout: list) {
                  if(dout != null) {
                     dout.writeUTF(ip + " : "+ msg);
                  }
               }
            }
         }catch(Exception e) {
            //e.printStackTrace();
         }
         
      }

   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Server server = null;
      try {
         server = new Server();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      server.start();

   }

}