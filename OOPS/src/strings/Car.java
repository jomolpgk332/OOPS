package strings;
import java.util.*;
public class Car {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("1)Bike\n 2)Car");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the details of bike");
		System.out.println("Enter the colour");
		s.append("Color: "+sc.next()+"\n");
		   System.out.println("Enter maximum speed");
		   s.append("Speed : "+sc.next()+"\n");
		   System.out.println("Enter the number of seats");
		   s.append("Number of the seats : "+sc.next()+"\n");
		  System.out.println("Enter the status of diskbreak(true/false)");
		  s.append(sc.next()+"\n");
		  System.out.println(s);
		  break;
		case 2:
			System.out.println("Enter the details of car");
			System.out.println("Enter the colour");
			s.append("Color: "+sc.next()+"\n");
			   System.out.println("Enter maximum speed");
			   s.append("Speed : "+sc.next()+"\n");
			   System.out.println("Enter the number of seats");
			   s.append("Number of the seats : "+sc.next()+"\n");
			   System.out.println("Enter the number of wheels");
			   s.append("Number of the wheels : "+sc.next()+"\n");
			   System.out.println("Enter the number of doors");
			   s.append("Number of the doors : "+sc.next()+"\n");
			  System.out.println("Enter the status of diskbreak(true/false)");
			  s.append(sc.next()+"\n");
			  System.out.println(s);
			  break;
			  default:
				  System.out.println("Invalid option");
	}
	}

}
