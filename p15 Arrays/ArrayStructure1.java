import java.util.Scanner;
public class ArrayStructure1{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements for x axis :");
	int i = sc.nextInt();
	System.out.println("Enter the number of elements for y axis :");
	int j = sc.nextInt(); 
	int[][] no=new int[j][i];//declaring
		for(int y=0;y<j;y++){
			for(int x=0;x<i;x++){
			System.out.println("Enter an integer value for element "+y+" , "+x+" : ");
			no[y][x]=sc.nextInt();//initializing
		}
	}
			//Display values in each element in the array
			System.out.println("The values in the array are :");
			for(int y=0;y<j;y++){
				for(int x=0;x<i;x++){
					System.out.print(" "+no[y][x]);
				}
			System.out.println();
			//}
			//System.out.println("The values in the array are :");
			//for(int y=j-1;y>-1;y--){
			//	for(int x=1;x>-1;x--){
			//		System.out.println(" "+no[y][x]);
			//	}
			//System.out.println();
			}
	}
}