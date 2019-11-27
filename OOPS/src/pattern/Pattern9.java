package pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();int j=0;
		for(int i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j||j==n-1-i) {
					System.out.print("*");
				}else
				{
				System.out.printf("%d",0);
		}
				}
			System.out.println();
		}

	}

}
