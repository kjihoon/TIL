package springlab;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryExam {

	public static void main(String[] args) {
		
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("springlab/SalaryExpr.xml");
		
		Random rand = (Random)factory.getBean("rand");
		SalaryExpr sal;
		
		int month = rand.nextInt(12)+1; 
		int grade = rand.nextInt(4)+1; 
		
	
		if(month%2==0) {
			sal = (SalaryExpr)factory.getBean("o");			
		}		
		else{
			sal =(SalaryExpr)factory.getBean("x");			
		}		
		System.out.println(month+"월 "+grade+"등급의 월급은 "+sal.getSalary(grade)+"입니다");		
		((ClassPathXmlApplicationContext) factory).close();
	}
}

