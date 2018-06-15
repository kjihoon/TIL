package day01;

//Thread ����
class Thread1 extends Thread{
   String msg;
   boolean flag =true;
   public Thread1(String msg) {
      this.msg=msg;      
   }
   public void setFlag(boolean flag) {
	   this.flag = flag;
   }
   
   public void run() {
	   int i =0;
	   while (flag) {
         System.out.println(msg+i++);
         try {
            Thread.sleep(300);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
   }
}

class Thread2 implements Runnable{
   String msg;
   boolean flag =true;
   public Thread2(String msg) {
      this.msg=msg;      
   }
   //thread ����
   public void setFlag(boolean flag) {
	   this.flag = flag;
   }
   
   @Override
   public void run() {
	   int i =0;
	   while (flag) {
         System.out.println(msg+i++);
         try {
            Thread.sleep(300);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }   
   }
   
}


public class T1 {
	//Main Thread
   public static void main(String [] args) throws InterruptedException {
      Thread1 t1 = new Thread1("T1");
      Thread2 r = new Thread2("T2");
      Thread t2 = new Thread(r); //��ü �����ڿ� �Ű������� �����ϰ� ���� �� �ִ�.
      t1.start();
      t2.start();
      Thread.sleep(5000);
      t1.setFlag(false);
      r.setFlag(false);
      
      
   }
}