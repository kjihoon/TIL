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
		System.out.println("����� ������ �Է� �Ͻðڽ��ϱ�?");
		int n = scanner.nextInt();
		int [] score = new int [n];
		System.out.print("������ ���ʷ� �Է��ϼ���!");
		for (int i=0;i<score.length;i++) {
			score[i]=scanner.nextInt();

		}
		System.out.print("������: ");
		for (int i=0;i<score.length;i++) {
			System.out.print(score[i]+", ");
		}
		
		GradeExpr grade = new GradeExpr(score);
		System.out.println("\n����: "+grade.getTotal());
		//System.out.println("���: "+grade.getAverage());
		System.out.printf("���: %.2f\n", grade.getAverage()); 
		System.out.println("�ְ� ����: "+grade.goodScore());
		System.out.println("���� ����: "+grade.BadScore());
		
	}

}
