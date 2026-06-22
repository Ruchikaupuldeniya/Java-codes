import java.util.Scanner;
public class JavaRecordArray1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
//input section
	System.out.println("How many students you have enter : ");
	int noOfStudents=sc.nextInt();
	StudentRecord[] sr=new StudentRecord[noOfStudents]; //ekma thanata data godak watenawanam
	System.out.println("Enter student details : ");
	System.out.println("---------------------- ");

	for(int i=0;i<noOfStudents;i++){
		sr[i]=new StudentRecord();//insert StudentRecord object for each element of the array ekma thanata data godak watenawanam
		System.out.println("Enter values for record :"+i);
		System.out.println("---------------------- ");
		System.out.println("Enter students name:");
		sr[i].studentName=sc.next();
		System.out.println("Enter students index ");
		sr[i].index=sc.next();
		System.out.println("Enter students practical marks");
		sr[i].pMarks=sc.nextByte();
		System.out.println("Enter students theory marks");
		sr[i].tMarks=sc.nextByte();
		//proccesing section
		sr[i].avg=(sr[i].pMarks+sr[i].tMarks)/2;
		System.out.println();
	}
	//output section
		System.out.println();
		System.out.println("Dispaly student records :");
		System.out.println("NAME\t\tINDEX\t\tP_MARKS\t\tT_MARKS\t\tAVERAGE");
		System.out.println("------\t\t------\t\t-----\t\t------\t\t");
		for(int i=0;i<noOfStudents;i++){
			System.out.println(sr[i].studentName+"\t\t"+sr[i].index+"\t\t"+sr[i].pMarks+"\t\t"+sr[i].tMarks+"\t\t"+sr[i].avg);
		
		}
	}
}
class StudentRecord{
	String studentName;//field1
	String index;//field2
	byte pMarks;//field3
	byte tMarks;//field4
	float avg;//field5
}
