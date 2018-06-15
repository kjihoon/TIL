package day6;

public class MethodLab6 {

	public static void main(String[] args) {
		char x1 [] = {'A','B','c'};
		convertChar(x1);
		char x2 [] = {'a','b','c','D','E','F'};
		convertChar(x2);
		char x3 [] = {'z','S','Z','S'};
		convertChar(x3);
	}
	public static void convertChar(char ch[]){
		int result [] = new int [ch.length];
		int i=0;
		System.out.println("-------------");
		System.out.print("호출전 :");
		for (char Char:ch) {
			System.out.print(Char);
		}
		for (int charnum:ch) {
			if (charnum>=97) {
				result[i] = (charnum-32);
			}else {
				result[i] = (charnum+32);
			}
			i++;
		}
	
		System.out.print("\n호출후 :");
		for (int Char:result) {
			System.out.print((char) Char);
		}
		System.out.println("\n-------------");
		
	}
}
