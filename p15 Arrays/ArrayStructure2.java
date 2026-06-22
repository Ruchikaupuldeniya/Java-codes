import java.util.Scanner;
public class ArrayStructure2{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements for arrays :");
	int i = sc.nextInt();
	int[] no1 = new int[i];//declaring
	int[] no2 = new int[i];//declaring
	int[] sum = new int[i];//declaring
	System.out.println();//for blank line
	System.out.println("Enter the number of elements for array 1 :");
	for(int x=0;x<i;x++){
		System.out.println("Enter a value for element "+x+" :");
		no1[x]=sc.nextInt();//initializing
		}
		System.out.println();//for blank line
		System.out.println("Enter the number of elements for array 2 :");
		for(int x=0;x<i;x++){
			System.out.println("Enter a value for element "+x+" :");
			no2[x]=sc.nextInt();//initializing
		}
		for(int x=0;x<i;x++){
			sum[x]=no1[x]+no2[x];
		}
		System.out.println();//for blank line
		System.out.println("The result array values are : ");
		for(int x=0;x<i;x++){
			System.out.println(sum[x]+" ");
		}		
	}
}