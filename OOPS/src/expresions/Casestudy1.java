package expresions;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Casestudy1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String regex= ("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
		//Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password validation
		String nme = "\\p{Upper}(\\p{Lower}+\\s?)";
	Pattern f = Pattern.compile("[A-Z][a-z]*");
	Pattern l  =  Pattern.compile("[A-Z]+([a-zA-Z]+)*");
	Pattern co =Pattern.compile("^[0-9]*$");
	Pattern rk =Pattern.compile("^[0-9]*$");
	Pattern re =Pattern.compile("^[0-9]*$");
	Pattern de = Pattern.compile("[A-Z]+([a-zA-Z]+)*");
	Pattern yr= Pattern.compile("^[0-9][0-9][0-9][0-9]");
		 Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter your first name : ");
		String fname=s.next();		
		Matcher fn=f.matcher(fname);
		System.out.println("Enter last name : ");
		String lname=s.next();
		Matcher ln=l.matcher(lname);
		System.out.println("Enter your Email id: ");
		String email=s.next();
		Matcher em=pattern.matcher(email);
		System.out.println("Enter your Registeration id : ");
		String regid=s.next();
		Matcher reg=re.matcher(regid);
		System.out.println("Enter your rank : ");
		String rank=s.next();
		Matcher r=rk.matcher(rank);
		System.out.println("Enter your year : ");
		String year=s.next();
		Matcher y=yr.matcher(year);
		System.out.println("Enter your department : ");
		String dept=s.next();
		Matcher d=de.matcher(dept);
		if(fn.matches()) {
			System.out.println("Name : "+lname);
		}
		else
		{
			System.out.println("invalid name");
		}
		if(ln.matches()) {
			System.out.println("Surname :  "+lname);
		}
		else
		{
			System.out.println("invalid ");
		}
		if(em.matches()) {
			System.out.println("Email : "+email);
		}
		else
		{
			System.out.println("invalid email");
		}
		if(reg.matches()) {
			System.out.println("Register number : "+regid);
		}
		else
		{
			System.out.println("invalid reg num");
		}
		if(r.matches()) {
			System.out.println("Rank : "+rank);
		}
		else
		{
			System.out.println("invalid rank");
		}
		if(y.matches()) {
			System.out.println("Year : "+year);
		}
		else
		{
			System.out.println("invalid year");
		}
		if(d.matches()) {
			System.out.println("Department : "+dept);
		}
		else
		{
			System.out.println("invalid ");
		}
	}

}
