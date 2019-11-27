package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int j=1;j<=(2*i);j++) {
				
					System.out.print("*");
				c++;
				if(c==i)
				System.out.printf(" ");
			}
			System.out.println();
		}

	}

}
