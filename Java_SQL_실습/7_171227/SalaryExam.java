package day7;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		bonus=0;
	}
	SalaryExpr(int bonus){
		this.bonus=bonus;
	}
	
	public int getSalary(int grade){
		if (grade==1) {
			bonus=bonus+100;
		}else if(grade==2) {
			bonus=bonus+90;
		}else if(grade==3) {
			bonus=bonus+80;
		}else if(grade==4) {
			bonus=bonus+70;
		}
		return bonus;
	}
}


public class SalaryExam {
	public static void main(String[] args){
		SalaryExpr salary = new SalaryExpr(100);
		SalaryExpr salary2 = new SalaryExpr();
		int month = day7.MethodLab3.getRandom(12);
		int grade = day7.MethodLab3.getRandom(4);
		int s=0;
		if (month%2==0) {
			s=s+salary.getSalary(grade);
		}else {
			s=s+salary2.getSalary(grade);
		}
		System.out.println(month+"월"+grade+"등급의 월급은"+s+"입니다.");
	}
}
