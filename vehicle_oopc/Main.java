package vehicle_oopc;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model");
		int m=sc.nextInt();
		System.out.println("enter engine");
		int e=sc.nextInt();
		System.out.println("enter color");
		String colour=sc.next();
		master M=new master(m,e,colour);
		//bike
		System.out.println("++++++this is bike data+++++");
		System.out.println("enter bike type");
		String t=sc.next();
		bike b=new bike(m,e,colour,t);
		b.bikeout();
		//bus
		System.out.println("++++++this is bus data+++++");
		System.out.println("enter bus capacity");
		int cap=sc.nextInt();
		bus B=new bus(m,e,colour,cap);
		B.busout();
		//car
		System.out.println("++++++this is car data+++++");
		System.out.println("enter car fuel type");
		String t1=sc.next();
		car c=new car(m,e,colour,t1);
		c.carout();
		System.out.println(b.toString());


	}

}
