package day9;


class Point{
	int x=2;
	int y=2;
	
	Point(){
		this.x=3;
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void get1(){
		System.out.println(x+""+y);
	}
}

class Point3d extends Point{
	int z;
	static int k =3;
	Point3d(int x,int y,int z){
		super();
		this.z=z;
	}
	void get(){
		System.out.println(x+""+y+""+z);
	}
}

public class Test {

	public static void main(String[] args) {
		Point3d p3 = new Point3d(1,1,1);
		System.out.println(p3.k);
	}

}
