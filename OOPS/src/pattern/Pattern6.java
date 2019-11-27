package pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();int j=0;
		for(int i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==j) {
					System.out.print("0");
				}else {
				System.out.printf("%d",i+1);
		}}
			System.out.println();
		}
	}

}
