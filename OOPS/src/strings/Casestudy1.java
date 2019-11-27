package strings;
import java.util.*;
public class Casestudy1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringBuffer s=new StringBuffer();
	System.out.println("Registration");
	System.out.println("Enter your name");
	s.append("Name : "+sc.next()+"\n");
	   System.out.println("Enter your address");
	   s.append("Address : "+sc.next()+"\n");
	   System.out.println("Contact Number");
	   s.append("Number : "+sc.next()+"\n");
	System.out.println("E-Mail ID");
	s.append("Email : "+sc.next()+"\n");
	   System.out.println("Enter proof type");
	   s.append("Proof type : "+sc.next()+"\n");
	   System.out.println("Enter proof id");
	   s.append("Proof id : "+sc.next()+"\n");
	       //ss.detail(name,address,contact,email,prooftype,proofid);
	  System.out.println("Thank you for registering.");
	  System.out.println(s);
	  
	}
	}
	