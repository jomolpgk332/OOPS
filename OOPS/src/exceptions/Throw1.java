package exceptions;

import java.util.Scanner;

public class Throw1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
			throw new ArithmeticException("B is greater");
		else
			throw new ArithmeticException("A is greater");

	}

}
