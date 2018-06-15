package work;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane l = new AirPlane("L747",1000);Plane c = new CargoPlane("C40",1000);
		printTitel();
		printinfo(l);printinfo(c);
		System.out.print("\n["+100+"운항]");
		l.flight(100);c.flight(100);
		printTitel();
		printinfo(l);printinfo(c);
		System.out.print("\n["+200+"주유]");
		l.refuel(200);c.refuel(200);
		printTitel();
		printinfo(l);printinfo(c);

		
	}
	public static void printinfo(Plane list){
		System.out.print(list.getPlaneName()+"\t");
		System.out.print(list.getFuelSize()+"\n");
		/*for (int i=0;i<list.length;i++){
			System.out.print(list[i].getPlaneName()+"\t");
			System.out.print(list[i].getFuelSize()+"\n");
		}*/
	}
	public static void printTitel(){
		System.out.println("\nPlane\t"+"fuelSize");
		System.out.println("-----------------");
	}

}
