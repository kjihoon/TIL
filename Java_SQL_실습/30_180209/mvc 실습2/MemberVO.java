package model.vo;

public class MemberVO {
	private String name;
	private String tel;
	private String acc;
	private String pass;

	public void setInfo(String name,String tel,String acc,String pass) {
		this.name = name;
		this.tel = tel;
		this.acc = acc;
		this.pass= pass;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAcc() {
		return acc;
	}
	public String getPass() {
		return pass;
	}
	
	
}
