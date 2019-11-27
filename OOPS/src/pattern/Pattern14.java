package pattern;
import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int l=str.length();
		int i,j,k=0;
		for(i=0;i<=n;i++) {
			for(j=0;j<l;j++) {
				char ch=str.charAt(j);
				for(k=0;k<=i;k++) {
					System.out.print(ch);
				}}
				System.out.println();
			}
		}
	}


