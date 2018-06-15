package emp1;

public class Company {

	public static void main(String[] args) {
		Employee emp [] = new Employee [2];
		emp[0]=new Secretary("Duke",1,"secretary",800);
		emp[1]=new Sales("Tuxi",2,"sales",1200);
		printEmployee(emp,true);
	}
	public static void printEmployee(Employee [] emp, boolean isTax) {
		if (isTax==false) {
			System.out.println("name\tdepartment\tsalary");
			System.out.println("-----------------------------");
			for (int i=0;i<emp.length;i++) {
				System.out.println(emp[i].getName()+"\t"+emp[i].getDepartment()+"\t"+emp[i].getSalary());
			}			
		}else if (isTax==true) {
			System.out.println("name\tdepartment\tsalary\ttax");
			System.out.println("------------------------------------");
			for (int i=0;i<emp.length;i++) {
				((Bonus) emp[i]).incentive(100);
				System.out.println(emp[i].getName()+"\t"+emp[i].getDepartment()+"\t"+emp[i].getSalary()+"\t"+
					(emp[i].tax())+"\t");
		
			}
		}
	}
}
