import java.util.Scanner;

public class Array2
{
	public static void main (String args[])
	{
		System.out.println("Enter your array size" );
		int n;
		Scanner input = new Scanner (System.in);
		n=input.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter your array elemenet" );
		for (int i=0; i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		
		
			System.out.println(" your array ");
			System.out.print("{");
			
		for (int i=0; i<arr.length;i++)
		{
			System.out.print(+arr[i]+" ");
		}
			System.out.print("}");
		
	}
}