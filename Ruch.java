import java.util.Scanner;

class Ruch
{
	public static void main(String [] args)
	{
		int n;
		System.out.println("Enter your array size: ");
		Scanner input = new Scanner (System.in);
		n=input.nextInt();
		int [] arr = new int[n];
		
		System.out.println("enter array element: ");
		
		for (int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.print(" array is:  "+"{");
		
		for (int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("}");
		
	}
}