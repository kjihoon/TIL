package day8;
import java.util.*;
class GradeExpr{
	int [] jumsu;
	GradeExpr(int [] jumsu){
		this.jumsu= jumsu;
	}
	
	public double getAverage() {
		double sum = 0;
		for (int i=0;i<jumsu.length;i++) {
			sum +=jumsu[i];
		}
		double mean = sum/(jumsu.length);
		return mean;
	}
	public int getTotal() {
		int sum = 0;
		for (int i=0;i<jumsu.length;i++) {
			sum +=jumsu[i];
		}
		return sum;
	}
	public int goodScore() {
		int max=0;
		for (int i=0;i<jumsu.length;i++) {
			if (jumsu[i]>max) {
				max=jumsu[i];
			}
		}
		return max;
	}
	public int BadScore() {
		int min=jumsu[0];
		for (int i=1;i<jumsu.length;i++) {
			if (jumsu[i]<min) {
				min=jumsu[i];
			}
		}
		return min;
	}
}
public class GradeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇명의 점수를 입력 하시겠습니까?");
		int n = scanner.nextInt();
		int [] score = new int [n];
		System.out.print("점수를 차례로 입력하세요!");
		for (int i=0;i<score.length;i++) {
			score[i]=scanner.nextInt();

		}
		System.out.print("점수들: ");
		for (int i=0;i<score.length;i++) {
			System.out.print(score[i]+", ");
		}
		
		GradeExpr grade = new GradeExpr(score);
		System.out.println("\n총점: "+grade.getTotal());
		//System.out.println("평균: "+grade.getAverage());
		System.out.printf("평균: %.2f\n", grade.getAverage()); 
		System.out.println("최고 점수: "+grade.goodScore());
		System.out.println("최저 점수: "+grade.BadScore());
		
	}

}
