import java.util.Scanner;
public class Highestplacement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the no of students placed in CSE:");
		int cse=scan.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		int ece=scan.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		int mech=scan.nextInt();
		if(cse>=0&&ece>=0&&mech >=0)
		{
			if(cse>ece && cse>mech)
			{
				System.out.println("Highest Placement\nCSE");
			}
			if(ece>cse && ece>mech) 
			{
				System.out.println("Highest Placement\nECE");
			}
			if(mech>cse&&mech>ece)
			{
				System.out.println("Highest Placement\nMECH");
			}
			if(cse==ece && cse>mech && ece>mech)
			{
				System.out.println("Highest Placement\nCSE\n ECE");
			}
			if(cse==mech && cse>ece && mech>ece)
			{
				System.out.println("Highest Placement\nCSE\nMECH");
			}
			if(ece==mech && ece>cse && mech>cse)
			{
				System.out.println("Highest Placement\nECE\nMECH");
			}
			if(cse==ece && ece==mech)
			{
				System.out.println("None of the department has got the highest placement");
			}
				
		}
		else {
			System.out.println("Input is Invalid");
		}

	}

}
