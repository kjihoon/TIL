package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int mat [][] = {
				{10,20,30,40,50},
				{5,10,15},
				{11,22,33,44},
				{9,8,7,6,5,4,3,2,1},
		};
		
		for (int i=0;i<mat.length;i++) {
			int sum=0;
			for (int j=0;j<mat[i].length;j++) {
				sum = sum + mat[i][j];
			}
			System.out.println(i+"행의 합은\t"+sum+"\t입니다!");
		}
	}

}
