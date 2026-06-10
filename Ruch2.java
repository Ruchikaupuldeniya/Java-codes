import java.util.Scanner;
public class Ruch2
{
	public static void main (String [] args)
	{
		System.out.println("Enter your Array size: ");	
		Scanner sc = new Scanner(System.in);
		int r= sc.nextInt();
		int s = sc.nextInt();
		int [][] arry = new int [r][s];
		
		System.out.println("Enter your Array element: ");
		for (int i=0;i<arry.length;i++)
			{ 
				for (int j=0; j<arry[0].length;j++)
				{
					arry[i][j]=sc.nextInt();
				}
			}
			
		
		System.out.println(" your Array :- ");
		for(int i=0; i<arry.length;i++)
		{
			for(int j=0; j<arry[0].length;j++)
			{
				System.out.print(arry[i][j]+" ");
			}
		System.out.println();
		}
	
	}	
}