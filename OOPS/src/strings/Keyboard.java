package strings;
import java.util.Scanner;
public class Keyboard {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the character(R/L)");
char ch=s.next().charAt(0);
System.out.println("ENTER THE STRING");
String str=s.next();
int l=str.length();
String str1="qwertyuiop asdfghjkl; zxcvbnm,./";
int l1=str1.length();
System.out.println("the original message");
int i=0,j;
for(i=0;i<l;i++)
{
for(j=0;j<l1;j++)
{
if(str.charAt(i)==str1.charAt(j)&&ch=='R')
{
System.out.print(str1.charAt(j-1));
}
if(str.charAt(i)==str1.charAt(j)&&ch=='L')
{
System.out.print(str1.charAt(j+1));
}
}

}
}}