import java.util.Scanner;

public class D2
{
	public static void main(String[]args)
	
	{
		
		System.out.println("Enter your array size: ");
		Scanner input = new Scanner (System.in);
		int r=input.nextInt();
		int c=input.nextInt();
		
		int [][] arr = new int[r][c];
		
		System.out.println("Enter the elements of the array: ");
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		
		System.out.println(" array: ");
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print (arr[i][j]+" ");
			}System.out.println();
			
		}
		
	}
}