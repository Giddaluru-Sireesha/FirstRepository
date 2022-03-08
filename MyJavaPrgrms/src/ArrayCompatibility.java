import java.util.Scanner;
public class ArrayCompatibility {
	

	public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	   int count=0;
	  System.out.println("Enter the size for First array:");
	  int n=scan.nextInt();
	  if(n>0)
	  {
	  int arr1[]=new int[n];
	  System.out.println("Enter the elements for First array:");
	  for(int i=0;i<=arr1.length-1;i++)
	  {
		  arr1[i]=scan.nextInt();
	  }
	  System.out.println("Enter the size for Second array:");
	  int n1=scan.nextInt();
	  if(n1>0)
	  {
	  int arr2[]=new int[n1];
	  System.out.println("Enter the elements for First array:");
	  for(int i=0;i<=arr2.length-1;i++)
	  {
		  arr2[i]=scan.nextInt();
	  }
	  
	  if(n==n1) {
		  for(int i=0;i<=arr1.length-1;i++)
		  {
		  if(arr1[i]>=arr2[i])
		  {
			 count++;
		  }
		  }
		  if(count==n)
		  {
			  System.out.println("Arrays are compatible");
		  }
		  else {
			  
		  System.out.println("Arrays are not compatible");
		  }
		  
	  }
		  else {
			  System.out.println("Arrays are not compatible");
		  }
	  }
	  else {
		  System.out.println("Invalid array size");
	  }
	  }
	  else {
		  System.out.println("Invalid array size"); 
	  }
	}
	

}
