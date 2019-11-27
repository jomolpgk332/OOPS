package pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--)
			{
					System.out.print(j+" ");
            }
			System.out.println();
				}

	}

}
