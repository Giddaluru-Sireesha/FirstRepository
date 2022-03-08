import java.util.*;
public class pan {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the PAN no:");
		String pan=scan.nextLine();
		if(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid PAN no");
		}
		else
		{
			System.out.println("Invalid PAN no");
		}
		

	}

}
