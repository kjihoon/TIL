package day15;

public class ThreadEx3 {

	public static void main(String[] args) {
		TreadEx3_1 tr = new TreadEx3_1();
		tr.start();
		tr.run();
		
		/*Runnable r = new TreadEx3_2();
		Thread tr2 = new Thread(r);
		tr2.run();*/
		
	}
}
class TreadEx3_1 extends Thread{
	public void run(){
		throwException();
	}

	public void throwException() {
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
/*
class TreadEx3_2 implements Runnable{
	public void run(){
		throwException();
	}

	public void throwException() {
		try{
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
*/

