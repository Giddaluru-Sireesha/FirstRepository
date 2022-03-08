import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word :");
	     String s=scan.nextLine();
		int l=s.length();
		Pattern p=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(s);
		boolean b=m.find();
		if(b)
		{
			System.out.println("Invalid Input");
		}
		else {
			String rev=new String();
		
		for(int i=l-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(s+" is a Palindrome");
		}
		else
		{
			System.out.println(s+" is not a Palindrome");
		}
		}

	}

}
