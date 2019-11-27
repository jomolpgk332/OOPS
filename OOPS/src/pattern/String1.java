package pattern;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=s.next();
		String str2=s.next();
		//String st=str.concat(str1);
		char temp[]=str.toCharArray();
		char temp1[]=str1.toCharArray();
		char temp2[]=str2.toCharArray();
	        for (int i = 0; i < temp.length; i++) {
		if(temp[i]=='a'||temp[i]=='e'||temp[i]=='i'||temp[i]=='o'||temp[i]=='u'||temp[i]=='A'||temp[i]=='E'||temp[i]=='I'||temp[i]=='O'||temp[i]=='U') {
			temp[i]='$';
		}
	        }
	        for (int i = 0; i < temp1.length; i++) {
	    		if(temp1[i]=='a'||temp1[i]=='e'||temp1[i]=='i'||temp1[i]=='o'||temp1[i]=='u'||temp1[i]=='A'||temp1[i]=='E'||temp1[i]=='I'||temp1[i]=='O'||temp1[i]=='U') {
	    			temp1[i]=temp1[i];
	    		}
	    		else
	    		{
	    			temp1[i]='#';
	    			
	    		}
	    		
	    	        }
	        for (int i = 0; i < temp2.length; i++) {
	        if(temp2[i]>=97 && temp2[i]<=122) {
	        	temp2[i]=(char) (temp2[i]-32);
	        }
	        }
	        str=new String(temp);
	        str1=new String(temp1);
	        str2=new String(temp2);
	        String str3=str.concat(str1);
	        String str4=str3.concat(str2);
	        
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str4);
	        }
		
	}


