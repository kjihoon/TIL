package exam2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("morning")
public class MorningGreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("������ ��ħ�Դϴ�.");
	}
}
