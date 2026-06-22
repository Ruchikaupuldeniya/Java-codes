import java.util.Scanner;
public class searching1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("How many elements you have enter : ");
	int elements=sc.nextInt();
	int x[]=new int[elements]; //declare the array
	System.out.println("Enter "+elements+" elements to the array: ");

	for(int i=0;i<x.length;i++){
		System.out.print("(" +(i+1)+ "):");
		x[i]=sc.nextInt();
	}
	System.out.println("");
		System.out.println("None sorted array elements are : ");
		for(int i=0;i<x.length;i++){
		System.out.println(x[i]+"\t");			
	}
	System.out.println("");
	System.out.println("Enter the value to search : ");
	int value=sc.nextInt();
	boolean found=false;
	int elementNo=0;
	for(int i=0;i<x.length;i++){
		if(value==x[i]){
			found=true;
			elementNo=(i+1);
			break;
		}
	}
	if(found)
		System.out.println("The value "+value+" is in the array at element "+ elementNo);		
	else
		System.out.println("The value "+value+" is not in the array");
	}
}			
	