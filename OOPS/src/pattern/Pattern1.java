package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.printf("%c",i+65);
			}
			System.out.print("\n");

		}

	}

}
