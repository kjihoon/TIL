package day8;

class Person{
	private String name;
	Person(String name){
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person{
	private String phoneNum;
 	private String email;
	
	Friend(String name,String phoneNum,String email){
		super(name);
		this.phoneNum=phoneNum;
		this.email=email;
	}
	public String getInfo() {
		return super.getInfo()+"\t" + phoneNum+"\t" + email;
	}
}

public class FriendTest {

	public static void main(String[] args) {

		Friend f [] = new Friend [5];
		f[0] = new Friend("ÁöÈÆ","010 2834 0595","naver");
		f[1] = new Friend("ÁöÈÆ","010 2834 0595","naver");
		f[2] = new Friend("ÁöÈÆ","010 2834 0595","naver");
		f[3] = new Friend("ÁöÈÆ","010 2834 0595","naver");
		f[4] = new Friend("ÁöÈÆ","010 2834 0595","naver");
		System.out.println("ÀÌ¸§\t¹øÈ£\t\tÀÌ¸ŞÀÏ");
		for (int i =0;i<f.length;i++) {
			System.out.println(f[i].getInfo());
		}
	
	}

}
