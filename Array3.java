import java.util.Scanner;
public class Array3
{
	public static void main (String []args)
	{
		
		System.out.println("Enter your array size" );
		Scanner input = new Scanner (System.in);
		int r=input.nextInt();
		int s=input.nextInt();
		
		int [][]arr=new int [r][s];
		
		System.out.println("Enter your array Element" );
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[0].length;j++)
				{
			         arr[i][j]=input.nextInt();
				}
		}
		
		System.out.println( "your array " );
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[0].length;j++)
				{
			         System.out.print(arr[i][j]);
					 System.out.print(" ");
				}
				 System.out.println("");
		}
		
	}
}