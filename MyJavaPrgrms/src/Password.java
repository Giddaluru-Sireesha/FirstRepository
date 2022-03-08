import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Password {
	private static boolean checkSize(String password) {
		return password.length()>=8;
	}
	
	private static boolean checkMoreThanOneUpperCase(String password) {
		char[] chars=password.toCharArray();
		int count=0;
		for(char ch:chars) {
			if(Character.isUpperCase(ch)) {
				++count;
			}
		}
		return count>=1;
	}
	private static boolean checkOneOrMoreLowerCase(String password) {
		char[] chars=password.toCharArray();
		int count=0;
		for(char ch: chars) {
			if(Character.isLowerCase(ch)) {
				++count;
			}
		}
		return count>=1;
	}
	private static boolean checkOneOrMoreSpecialCharacter(String password) {
		char[] chars=password.toCharArray();
		int count=0;
		for(char ch:chars) {
			if(ch=='@' || ch=='#' || ch=='*') {
				++count;
			}
		}
		return count>=1;
	}
	private static boolean checkOneOrMoreDigit(String password) {
		char[] chars=password.toCharArray();
		int count=0;
		for(char ch:chars) {
			if(Character.isDigit(ch)) {
				++count;
			}
		}
		return count>=1;
	}
	private static boolean checkValidity(String password) {
		char[] chars=password.toCharArray();
		for(char ch:chars) {
			if(!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isLetterOrDigit(ch) && ch !='@' && ch !='#' && ch !='#') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Pattern p=Pattern.compile("^(?=(?:[^A-Z]*[A-Z]+[^A-Z]*))(?=(?:[^a-z]*[a-z]+[^a-z]*))(?=(?:[^@*#]*[@*#]+[^@*#]*))(?=(?:\\D*\\d+\\D*))[a-zA-Z\\d@*#]{8,}");
		System.out.println("Generate your Security Code");
		String password=scan.nextLine();
		Matcher m=p.matcher(password);
		
		if(m.matches()) {
			System.out.println("Security Code Generated Successfully");
		}
		else {
			System.out.println("Invalid Security Code,Try Again!");
		}
	}
	

}
