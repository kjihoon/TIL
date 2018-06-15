package day11;

public class ExceptioTest2 {
	public static void main(String[] args) {
		System.out.println("수행시작");
		try{
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산결과:"+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("두개의 프로그램 아규먼트를 입력하세요!");
		}catch(ArithmeticException e){
			/*System.out.println("두 번째 숫자는 0이면 안됩니다! ");
			System.out.println(e.getMessage());*/
			System.out.println(e);
			e.printStackTrace();
			return;
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력해야죠!");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("xxxx");
		}finally{
			System.out.println("이 블럭은 반드시 수행합니다요..");
		}
		System.out.println("수행종료");
	}
}
