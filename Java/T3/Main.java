package T3;

import java.util.Scanner;

class Receiver implements Runnable{
	String cmd;
	
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	@Override
	public void run() {
		System.out.println("run ����");	
		while(true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(cmd != null && cmd.equals("s")) {
				//Send Msg
				for (int i=0;i<=30;i++) {
					System.out.println(i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}	
}


public class Main {
	public static void main(String [] args) {
		Receiver r = new Receiver();
		Thread t = new Thread(r);
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input cmd");
		
		String cmd = sc.nextLine();
		r.setCmd(cmd);
		
		String cmd2 = sc.nextLine();
		r.setCmd(cmd2);
		
		
		System.out.println("Main....");
	}
}
