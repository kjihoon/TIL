package day16;


interface Testable{
	final static String fs = "Interface Test";
	abstract void output(String s);
}



	

public class InnerTest4 {
	void pr(Testable o){
		o.output("Test");
		System.out.println(Testable.fs);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main start");
		InnerTest4 n = new InnerTest4();
		n.pr(new Testable(){
			int su =100;
			public void output(String s){
				System.out.println("Sdfsdf "+s);
				System.out.println("Sdfsdf "+su);
			}
		}
				);
	}

}
