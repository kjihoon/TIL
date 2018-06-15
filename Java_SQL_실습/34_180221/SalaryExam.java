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
		System.out.println(month+"�� "+grade+"����� ������ "+sal.getSalary(grade)+"�Դϴ�");		
		((ClassPathXmlApplicationContext) factory).close();
	}
}

