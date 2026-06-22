
import java.util.Scanner;
public class JavaRecordArray{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
//input section
	System.out.println("How many students you have enter : ");
	int noOfStudents=sc.nextInt();
	StudentRecord[] sr=new StudentRecord[noOfStudents];
	System.out.println("Enter student details : ");
	System.out.println("---------------------- ");

	for(int i=0;i<noOfStudents;i++){
		sr[i]=new StudentRecord();//******insert StudentRecord object for each element of the array********
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
	for(int i=0;i<noOfStudents;i++){
		System.out.println("Record "+i);
		System.out.println("---------------");
		System.out.println("Student name\t\t\t: "+sr[i].studentName);
		System.out.println("Student index\t\t\t:"+sr[i].index);
		System.out.println("Student practical marks\t\t:"+sr[i].pMarks);
		System.out.println("Student theory marks\t\t:"+sr[i].tMarks);	
		System.out.println("Student average marks\t\t:"+sr[i].avg);
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
