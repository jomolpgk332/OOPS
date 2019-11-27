package strings;
import java.util.Arrays;
import java.util.Scanner;

public class Santacluse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the guest's name");
		String str1=s.next();
		System.out.println("Enter the name of the residence host");

		String str2=s.next();

		String str3=str1.concat(str2);
		        char[] chars = str3.toCharArray();
		        Arrays.sort(chars);
		        System.out.println("Enter name2");
		String c1=s.next();
		char[] m1 = c1.toCharArray();
		Arrays.sort(m1);
		        System.out.println(m1);
		        String sorted = new String(chars);
		        String a=new String(chars);
		        String a1=new String(m1);
		        if(a.equals(a1))
		        {
		        System.out.println("YES");
		}
		        else
		        {
		        System.out.println("NO");
		        }
}
}