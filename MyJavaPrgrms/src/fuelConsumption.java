import java.util.Scanner;
public class fuelConsumption {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank" );
		double s=Scan.nextInt();
		System.out.println("Enter the distance covered" );
		double d=Scan.nextInt();
		if(s>0&&d>0)
		{
		double c=((s/d)*100);
		System.out.println("Litrers/100KM: " +String.format("%.2f",c));	
		double miles=(d*0.6214);
		double gallons=(s*0.2642);
		double u=miles/gallons;
		System.out.println("Miles/gallons: "+String.format("%.2f",u));

	}
		else {
			System.out.println("Invalid Input");
			
		}

}
}
