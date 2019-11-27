package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usrnmpwd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";//email validation
		Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password validation
		 Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter your username : ");
		String uname=s.next();
		Matcher em=pattern.matcher(uname);//em is variable
		System.out.println("Enter your password : ");
		String pwd=s.next();//to get password
		Matcher pw=pswNamePtrn.matcher(pwd);//matcher is a class
		if(em.matches()) {//email is matching 
			System.out.println("valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		if(pw.matches()) {//checking password is matching
			System.out.println("valid password");
		}
		else {
			System.out.println("invalid password");
		}
	}

}
