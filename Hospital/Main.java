package Hospital;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n,gen,dise,docs;
		int old,bno,fno,pall,room;
		int s;
		System.out.println("Enter 1 for doctor\n Enter 2 for patient \n Enter 3 for nurse");
		s=sc.nextInt();
		switch(s)
		{
		case 1: 
		 System.out.println("Enter Name:");
		 n=sc.next();
		 System.out.println("Enter Age:");
		 old=sc.nextInt();
		 System.out.println("Enter Gender:");
		 gen=sc.next();
		 System.out.println("Enter speciality:");
		 docs=sc.next();
		 doctor d=new doctor(n,old,gen,docs);
		 System.out.println("------Doctor Details---------");
		 d.docout();
		 break;
		 
		case 2: 
			 System.out.println("Enter Name:");
			 n=sc.next();
			 System.out.println("Enter Age:");
			 old=sc.nextInt();
			 System.out.println("Enter Gender:");
			 gen=sc.next();
			 System.out.println("Enter bed number:");
			 bno=sc.nextInt();
			 System.out.println("Enter disease:");
			 dise=sc.next();
			 patient p=new patient(n,old,gen,bno,dise);
			 System.out.println("------Patient Details---------");
			 p.patientout();
			 break;
			 
		case 3: 
			 System.out.println("Enter Name:");
			 n=sc.next();
			 System.out.println("Enter Age:");
			 old=sc.nextInt();
			 System.out.println("Enter Gender:");
			 gen=sc.next();
			 System.out.println("Enter floor number:");
			 fno=sc.nextInt();
			 System.out.println("Enter patients allocated:");
			 pall=sc.nextInt();
			 System.out.println("Enter room number:");
			 room=sc.nextInt();
			 nurse nu=new nurse(n,old,gen,fno,pall,room);
			 System.out.println("------Patient Details---------");
			 nu.nurseout();
			 break;
		default:
			System.out.println("Invalid input,please enter valid input.");


		}
	}

}
