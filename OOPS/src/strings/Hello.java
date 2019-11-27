package strings;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int length=a.length();
		char b[]=a.toCharArray();
		int i,j;
		for(i=0;i<length;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(b[j]+" ");
			}
			System.out.println();

		}

	}

}
