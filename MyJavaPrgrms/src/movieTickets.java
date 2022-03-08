import java.util.Scanner;
public class movieTickets {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of tickets");
	int tickets=scan.nextInt();
	if(tickets>=5 && tickets<=40) {
		System.out.println(" Do you want refreshment:");
		String ref=scan.next();
		System.out.println(" Do you have a coupon code:");
		String coupon=scan.next();
		System.out.println("Enter the circle:");
		String circle=scan.next();
		
		double cost=0;
		switch(circle)
		{
		case "q":{
			int ticcost=150;
			cost=tickets*ticcost;
			if(tickets>20)
			{
				cost=cost -(cost* 10/100);
			}
			if(coupon.equals("y"))
			{
				cost=cost-(cost* 2/100);
			}
			if(ref.equals("y"))
			{
				cost=cost+(50*tickets);
			}
			System.out.println("Ticket cost:"+String.format("%.2f",cost));
			break;
		}
		case "k":{
			int ticcost=75;
			cost=(tickets*ticcost);
			if(tickets>20)
			{
				cost=cost -(cost* 10/100);
			}
			if(coupon.equals("y"))
			{
				cost=cost-(cost* 2/100);
			}
			if(ref.equals("y"))
			{
				cost=cost+(50*tickets);
			}
			System.out.println("Ticket cost:"+String.format("%.2f",cost));
			break;
		}
		default:System.out.println("Invalid Input");
		break;
		}
		
		
	}
	else {
		System.out.println("Minimum of 5 tickets and Maximum of 40 tickets");
	}

	}

}
