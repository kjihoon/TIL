package day4;

public class TwoArrayTest1 {
	public static void main (String[] arg) {
		int [][] nums = {
				{1,2,3,4},
				{5,6,7,8},
				{3,45,65,4},
				{3,5,2,1}
						};

		for (int i =0;i<=nums.length-1;i++) {
			for (int j =0;j<=nums.length-1;j++) {
				if (i==j) {
					System.out.print(nums[i][j]+"\t");
				}
				
			}

		}
		System.out.println("\n--------");
		for (int i =0;i<=nums.length-1;i++) {
			for (int j =0;j<=nums.length-1;j++) {
				if (i+j==nums.length-1) {
					System.out.print(nums[i][j]+"\t");
				}
				
			}

		}
	}
}
