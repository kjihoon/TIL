package day15;
import javax.swing.*;
class ThreadEx extends Thread{
	public void run(){
		for (int i=10;i>0;i--){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
}

public class ThreadEx5 {

	public static void main(String[] args) throws Exception{
		
		ThreadEx th = new ThreadEx();
		th.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력값은 "+input+"입니다.");
	
	}
}

