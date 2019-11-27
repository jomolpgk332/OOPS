package strings;
import java.io.*;
public class Customerdetails {
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NAME");
		StringBuffer name=new StringBuffer(br.readLine());
		System.out.println("ENTER THE ID");
		StringBuffer id=new StringBuffer(br.readLine());
		System.out.println("ENTER THE AGE");
		StringBuffer age=new StringBuffer(br.readLine());
		System.out.println("ENTER THE ADDRESS");
		StringBuffer address=new StringBuffer(br.readLine());
		System.out.println("ENTER THE SALARY");
		StringBuffer salary=new StringBuffer(br.readLine());
		System.out.println("ENTER THE GENDER");
		StringBuffer gender=new StringBuffer(br.readLine());
		System.out.println("EMPLOYEE DETAILS");
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(gender);
		}

		}
