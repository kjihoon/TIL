package day16;

class LocalTest{
	String name = "java";
	void pr(final String s){
		final int su= 100; //inner class���� final ������ ���� ������ !!������ final ���� ���� ���󸮺����°� ����.
		System.out.println(s+":"+su);
		class Local{
			void pr(String ls){
				System.out.println("s  :"+s);
				System.out.println("ls :"+ls);
				System.out.println(name);
				System.out.println(su);				
			}
		}
		Local lt = new Local();
		lt.pr("Local Test");
	}
}



public class InnerTest2 {

	public static void main(String[] args) {
		LocalTest lt2 = new LocalTest();
		lt2.pr("Main Call");
	}

}
