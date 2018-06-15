package day5;

public class MethodLab3 {

	public static void main(String[] args) {
		int rand1;
		for (int i=1;i<=5;i++) {
			rand1=getRandom(10);
			System.out.print(rand1+",\t");
		}
		System.out.println();
		for (int i=1;i<=5;i++) {
			rand1=getRandom2(10,20);
			System.out.print(rand1+",\t");
		}
	}
	public static int getRandom(int n){
		return (int) (Math.random()*n)+1;
	}
	public static int getRandom2(int n1, int n2){
		return (int) (Math.random()*(n2-n1))+n1;
	}

}