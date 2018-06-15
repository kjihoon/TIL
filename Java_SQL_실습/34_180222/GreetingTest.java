package exam2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now(); 
		int time = currentTime.getHour();
		
		ApplicationContext factory 
		   = new ClassPathXmlApplicationContext("exam2/hi.xml");
		Greeting greet;
		if (time<12){
			greet = (Greeting) factory.getBean("morning");
		}else if (time<17){
			greet = (Greeting) factory.getBean("afternoon");
		}else{
			greet = (Greeting) factory.getBean("evening");
		}
		
		greet.greet();
		((ClassPathXmlApplicationContext) factory).close();
		
	}

}
