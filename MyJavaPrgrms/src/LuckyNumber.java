import java.util.Scanner;
public class LuckyNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the car no:");
		int num=scan.nextInt();
		if(num<1000 || num>9999)
		{
			System.out.println(num +" is not a valid car number");
		}
		else {
			while(num>0)
			{
				sum+=num%10;
				num/=10;
			}
			if(sum%3==0 || sum%5==0 || sum%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
		}
	}

}
