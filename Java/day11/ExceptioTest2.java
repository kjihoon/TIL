package day11;

public class ExceptioTest2 {
	public static void main(String[] args) {
		System.out.println("�������");
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("������:"+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���!");
		}catch(ArithmeticException e){
			/*System.out.println("�� ��° ���ڴ� 0�̸� �ȵ˴ϴ�! ");
			System.out.println(e.getMessage());*/
			System.out.println(e);
			e.printStackTrace();
			return;
		}catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ؾ���!");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("xxxx");
		}finally{
			System.out.println("�� ���� �ݵ�� �����մϴٿ�..");
		}
		System.out.println("��������");
	}
}
