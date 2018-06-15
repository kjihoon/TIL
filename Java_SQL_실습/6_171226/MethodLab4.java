package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30};
		int arr2[] = {100, 500, 300, 200, 400};
		int arr3[] = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		int Max1=MaxNumArray(arr1);
		int Max2=MaxNumArray(arr2);
		int Max3=MaxNumArray(arr3);
		System.out.print("배열 1:\t");
		arrprint(arr1);
		System.out.print("\n배열 2:\t");
		arrprint(arr2);
		System.out.print("\n배열 3:\t");
		arrprint(arr3);
		System.out.println("\n가장 큰값은"+Max1+" 입니다");
		System.out.println("가장 큰값은"+Max2+" 입니다");
		System.out.println("가장 큰값은"+Max3+" 입니다");
	}
	public static int MaxNumArray(int [] list){
		int maximum=list[0];
		for (int i = 1;i<list.length;i++) {
			if (maximum<list[i]){
				maximum=list[i];
			}
		}
		return maximum;
	}
	public static void arrprint(int arr []){
		for (int num:arr) {
			System.out.print(num+" ");
		}
	}


}
