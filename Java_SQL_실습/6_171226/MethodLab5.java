package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);

	}
	public static int [] powerArray(int x){
		int arr [] = {1,2,3,4,5,6,7,8,9,10};
		int result [] = new int [10];
		for (int i =0;i<arr.length;i++) {
			result[i] = arr[i]*x;
			System.out.print(result[i]);
			if (i<result.length-1)
				System.out.print(",");
		}
		System.out.println();
		return result;
	}


}
