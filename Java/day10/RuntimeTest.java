package day10;
public class RuntimeTest {
	public static void main (String [] args) throws Exception{
		// example
		// Runtime�� jvm�̴�.
		// Runtime ��ü�� new Runtime ���� ���� �����ʴ´�.
		Runtime r1 = Runtime.getRuntime(); //��ü ������ ������ִ� �Ϲ� �޼��� ::factory method�� �Ҹ�
		//r.exec("c:/windows/notepad.exe");
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		// ��ü�� ���� �ϳ��� ����Ǿ����� �˼� �ִ�. <-(�̱��� ������ ����� Ŭ����) java.lang.Runtime@15db9742
	}
}
