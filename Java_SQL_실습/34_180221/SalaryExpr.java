package springlab;

public class SalaryExpr {
	    int bonus;
		
	    SalaryExpr(){
	    	this(0);
	    }
		
	    SalaryExpr(int bonus){
	    	this.bonus = bonus;	
	    }
	    
	    int getSalary(int grade){
	    	int sal=0;
	        if(grade==1) sal = bonus+100;
	        else if(grade==2) sal = bonus+90;
	        else if(grade==3) sal = bonus+80;
	        else if(grade==4)sal = bonus+70;
	        return sal;        
	    }
}
