package pattern;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=1;
		double c=1,b=2.0;
		System.out.print(a+" "+b+" ");
		int i=3;
		while(i<=n) {
		if(i%2==1) {
			c=c*3.0;
			System.out.print(c+" ");
		}
		else
		{
			b=b*3.0;
			System.out.print(b+" ");
		}
		i++;
		}

	}

}
