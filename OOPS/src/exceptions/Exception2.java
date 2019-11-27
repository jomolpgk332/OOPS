package exceptions;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
		System.out.println(e);
		
	}


	}

}
