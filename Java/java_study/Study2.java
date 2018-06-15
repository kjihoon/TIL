import java.util.*;
import java.net.*;
public class Study2 {
	public static void main(String []args){
		InetAddress ip = null;
		InetAddress iparr =null;
		try{
			ip=InetAddress.getByName("www.nate.com");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			System.out.println(ip.toString());
			System.out.println(ip);
			
			byte [] barr = ip.getAddress();
			for (byte i : barr){
				System.out.print(i+" ");
			}
			System.out.println(Arrays.toString(barr));
			
			iparr = InetAddress.getByName("www.nate.com");
		}catch(Exception e){
			
		}
		
	}
}
