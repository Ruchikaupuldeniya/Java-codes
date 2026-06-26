import java.util.Scanner;
public class vehicle{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

//input section
	System.out.println("How many vehicles you have enter : ");
	int noOfVehicles=sc.nextInt();
	VehicleRecord[] vr=new VehicleRecord[noOfVehicles]; 
	System.out.println("Enter vehicle details : ");
	System.out.println("---------------------- ");

	for(int i=0;i<noOfVehicles;i++){
		vr[i]=new VehicleRecord(); //insert StudentRecord object for each element of the array ekma thanata data godak watenawanam
		System.out.println("Enter values for record :"+(i+1));
		System.out.println("---------------------- ");
		System.out.println("Enter Vehicle Model:");
		vr[i].VehicleModel=sc.next();
		System.out.println("Enter Vehicle Number:");
		vr[i].VehicleNo=sc.nextInt();
		System.out.println("Enter Owners ID:");
		vr[i].OwnersId=sc.nextInt();
		System.out.println("Enter Vehicle color:");
		vr[i].VehicleColor=sc.next();
		System.out.println("Enter the price");
		vr[i].Price=sc.nextDouble();

	}
	//output section
		System.out.println();
		System.out.println("Dispaly Vehicle records :");
		System.out.println("MODEL\t\tNO\t\tOWNERSID\t\tCOLOR\t\tPRICE");
		System.out.println("------\t\t------\t\t-----\t\t\t------\t\t-----\t\t");
		for(int i=0;i<noOfVehicles;i++){
			System.out.println(vr[i].VehicleModel+"\t\t"+vr[i].VehicleNo+"\t\t"+vr[i].OwnersId+"\t\t\t"+vr[i].VehicleColor+"\t\t"+vr[i].Price);
		}

		System.out.println("");
		System.out.println("Enter the owners ID to search : ");
		int value=sc.nextInt();
		boolean found=false;
		int elementNo=0;
		for(int i=0;i<vr.length;i++){
			if(value==vr[i].OwnersId){
				found=true;
				elementNo=i;
				break;
		/*System.out.println("");   //string 1k search karaddi == kiyana eka wenuwata equals danna one
		System.out.println("Enter the vehicle no to search : ");
		int value=sc.nextInt();
		boolean found=false;
		int elementNo=0;
		for(int i=1;i<vr.length;i++){
			if(value.equals(vr[i].VehicleNo){
				found=true;
				elementNo=i;
				break;*/

			}
		}
		if(found){
			int i=elementNo;
			System.out.println("MODEL\t\tNO\t\tOWNERSID\t\tCOLOR\t\tPRICE");
			System.out.println("------\t\t------\t\t-----\t\t\t------\t\t-----\t\t");
			System.out.println(vr[i].VehicleModel+"\t\t"+vr[i].VehicleNo+"\t\t"+vr[i].OwnersId+"\t\t\t"+vr[i].VehicleColor+"\t\t"+vr[i].Price);
		}
		else
				System.out.println("The owner "+value+" is not in the record");
	}
}

class VehicleRecord{
	String VehicleModel;//field1
	int VehicleNo;//field2
	int OwnersId;//field3
	String VehicleColor;//field4
	double Price;//field5

}
