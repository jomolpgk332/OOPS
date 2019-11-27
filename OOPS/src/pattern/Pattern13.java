package pattern;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j,c=0,b=n,a=n;//initializng variables
		for(i=1;i<n;i++) {
			
			for(j=1;j<(2*n)+1;j++) {
				if(i+j==5 || j-i==5) {
					System.out.print("*");
					
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
			
	}
	}
	}
