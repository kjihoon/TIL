package day16;


class Outer{
	void pr(){
		System.out.println("Outer's pr() method");
	}
	class Inner{
		void pr(){
			System.out.println("Inner's pr() method");
		}
	}
	static class Static_Inner{
		void pr(){
			System.out.println("Static_Inner's pr() Method");
		}
	}
}



public class InnerTest1 {

	public static void main(String[] args) {
		new Outer.Static_Inner().pr();
	    Outer o =	new Outer();
	    o.pr();
	    Outer.Inner i = o.new Inner();
	    i.pr();
	}

}
