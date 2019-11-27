package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=s.next();
		String str2=s.next();
		String st=str.concat(str1);
		char temparray[]=st.toCharArray();
		Arrays.sort(temparray);
		char temp[]=str2.toCharArray();
		String sort1=new String(temparray);
		String sort2=new String(temp);
		if(sort1.equals(sort2)) {
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
