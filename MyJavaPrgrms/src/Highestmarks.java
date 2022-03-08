import java.util.Scanner;
public class Highestmarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of semester:");
		int sems=scan.nextInt();
		if(sems<=0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		int arr[]=new int[sems];
		for(int i=0;i<sems;i++)
		{
			System.out.println("Enter no of subjects in"+(i+1)+ "semester:");
			arr[i]=scan.nextInt();
		}
		int a=0;
		int marks[]=new int[sems];
		for(int i=0; i<sems && a==0;i++)
		{
			int high=0;int mark=0;
			System.out.println("Marks obtained in semester "+(i+1)+": ");
			for(int j=0;j<arr[i];j++)
			{
				mark=scan.nextInt();
				if(mark<0) {
					System.out.println("You have entered invalid mark.");
					a=1;
					break;
					
				}
				if(mark>high) {
					high=mark;
				}
			}
			marks[i]=high;
		}
		for(int i=0;i<sems && a==0;i++)
		{
			System.out.println("Maximum marks in"+String.valueOf(i+1)+"semester:"+marks[i]);
		}
	
		
		

	}

}
