import java.util.Scanner;
public class JavaRecordWithReferencePointers{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
//input section
	System.out.println("How many students you have enter : ");
	int noOfStudents=sc.nextInt();
	StudentRecord top=new StudentRecord();
	StudentRecord go=top;
	System.out.println("Enter student details : ");
	System.out.println("---------------------- ");

	for(int i=0;i<noOfStudents;i++){
		//go=new StudentRecord();THIS IS WRONG
		System.out.println("Enter values for record :"+i);
		System.out.println("---------------------- ");
		System.out.println("Enter students name:");
		go.studentName=sc.next();
		System.out.println("Enter students index:");
		go.index=sc.next();
		System.out.println("Enter students practical marks:");
		go.pMarks=sc.nextByte();
		System.out.println("Enter students theory marks:");
		go.tMarks=sc.nextByte();
		//proccesing section
		go.avg=(go.pMarks+go.tMarks)/2;
		System.out.println();
		go.p=new StudentRecord();
		go=go.p;
	}
		//output section
		System.out.println();
		System.out.println("Dispaly student records :");
		System.out.println("NAME\t\tINDEX\t\tP_MARKS\t\tT_MARKS\t\tAVERAGE");
		System.out.println("------\t\t------\t\t-----\t\t------\t\t------");
		go=top;
		
		for(int i=0;i<noOfStudents;i++){
System.out.println(go.studentName+"\t\t"+go.index+"\t\t"+go.pMarks+"\t\t"+go.tMarks+"\t\t"+go.avg);
go=go.p;
			
		
		}
	}
}
//java record structure
class StudentRecord{
	String studentName;//field1
	String index;//field2
	byte pMarks;//field3
	byte tMarks;//field4
	float avg;//field5
	StudentRecord p= null;
}
