package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		int k=0;
		while(k<=n*2) {
			for(i=0;i<n;i++) {
				for(j=0;j<=i;j++) {
					System.out.printf("%c",k+65);
				}
				System.out.print(" ");
			}
		}

	}

}
