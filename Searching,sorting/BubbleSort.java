import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("How many elemants you have enter : ");
	int elements=sc.nextInt();
	int x[]=new int[elements]; //declare the array
	System.out.println("Enter "+ elements +" elements to the array: ");

	for(int i=0;i<x.length;i++){
		System.out.print("("+(i+1)+"): ");
		x[i]=sc.nextInt();
	}
	System.out.println(""); 
		System.out.println("non sorted array elements are : ");
		for(int i=0;i<x.length;i++){
		System.out.println(x[i]+"\t");			
	}
	System.out.println("");
	/*Bubble sort code segment
	int temp=0;
	for(int j=0;j<x.length;j++){       
		for(int i=1;i<x.length-j;i++){ //eka loop 1k yaddi podima no eka right side kelawaratama yanwa 
			if(x[i-1]>x[i]){
				temp=x[i-1];
				x[i-1]=x[i];
				x[i]=temp;*/
	/*insertion sort code segment------------------------------------
	int temp=0;
	for(int j=0;j<x.length-1;j++){
		for(int i=j+1;i<x.length;i++){
			if(x[j]>x[i]){
				temp=x[j];
				x[j]=x[i];
				x[i]=temp;*/
    int temp=0;
	for(int j=0;j<x.length-1;j++){                                 
		for(int i=0;i<x.length-1;i++){ 
			if(x[i]>x[i+1]){
				temp=x[i];
				x[i]=x[i+1]; 
				x[i+1]=temp; 
			}
		}
	}
		System.out.println("sorted array are : ");	
		for(int i=0;i<x.length;i++){
		System.out.println(x[i]+"\t");
		}
	}
}

	

