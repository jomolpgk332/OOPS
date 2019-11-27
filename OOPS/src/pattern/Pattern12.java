package pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,k,j;//initializng variables
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);//to print the values in j
			}
			for(j=i;j<n;j++) {
				System.out.print(" ");//for getting space in between
		}
			for(k=i;k>=1;k--) {	//for getting the right side value use k
				System.out.print(k);
			}
			System.out.println();
	}

}
}
