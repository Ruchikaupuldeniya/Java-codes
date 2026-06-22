import java.util.Scanner;
public class 2DArrayStructure{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements for X axis :");
	int i = sc.nextInt();
	System.out.println("Enter the number of elements for Y axis :");
	int j = sc.nextInt();
	
	int[][] no1= new int[i][j];//declaring
	int[][] no2 = new int[i][j];//declaring
	int[][] sum = new int[i][j];//declaring
	System.out.println();//for blank line
	System.out.println("Enter the number of elements for array 1 :");
	for(int x=0;x<i;x++){
		for(int y=0;y<i;y++){
			System.out.println("Enter an integer value for element "+y+" , "+x+" : ");
			no[x][y]=sc.nextInt();//initializing
			}
	}
		System.out.println();//for blank line
		System.out.println("Enter the number of elements for array 2 :");
			for(int x=0;x<i;x++){
				for(int y=0;y<i;y++){
				System.out.println("Enter an integer value for element "+y+" , "+x+" : ");
				no[x][y]=sc.nextInt();//initializing
				}
			}
		for(int x=0;x<i;x++){
			for(int y=0;y<j;y++){
			sum[x][y]=no1[x][y]+no2[x][y];
			}
		}
		System.out.println();//for blank line
		System.out.println("The result array values are : ");
		for(int x=0;x<i;x++){
			for(int y=0;y<j;y++){
			System.out.println(sum[x][y]+" ");
			}	
		}		
	}
}