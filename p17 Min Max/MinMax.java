import java.util.Scanner;
public class MinMax{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter how many no:");
	int no=sc.nextInt();
	int max=0;
	int min=0;
	int value=0;
	float total=0;
	boolean b=true;
	
		for(int i=0;i<no;i++){
			System.out.print("(" +i+ ").");
			value=sc.nextInt();
			if (b){
			max=value;
			min=value;
			b=false;
 			}
			else{
				if(value>max){
				max=value;
				}
				if(value<min){
				min=value;
				}
			}
			total=total+value;
		}
		double avg = total/no;
		System.out.println("Maxium no is "+max);
		System.out.println("Minimum no is "+min);
		System.out.println("Average is "+avg);
	}

}