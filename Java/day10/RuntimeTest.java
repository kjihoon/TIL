package day10;
public class RuntimeTest {
	public static void main (String [] args) throws Exception{
		// example
		// Runtime은 jvm이다.
		// Runtime 객체는 new Runtime 으로 생성 되지않는다.
		Runtime r1 = Runtime.getRuntime(); //객체 생성을 대신해주는 일반 메서드 ::factory method로 불림
		//r.exec("c:/windows/notepad.exe");
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		// 객체는 실제 하나만 실행되었음을 알수 있다. <-(싱글톤 패턴이 적용된 클래스) java.lang.Runtime@15db9742
	}
}
