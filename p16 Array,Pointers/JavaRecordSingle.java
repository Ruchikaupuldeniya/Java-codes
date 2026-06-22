import java.util.Scanner;
public class JavaRecordSingle{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	StudentRecord sr=new StudentRecord();
	//input section
	System.out.print("Enter student name : ");
	sr.studentName=sc.next();
	System.out.print("Enter student index : ");
	sr.index=sc.next();
	System.out.print("Enter student practical marks : ");
	sr.pMarks=sc.nextByte();
	System.out.print("Enter student theory marks : ");
	sr.tMarks=sc.nextByte();
	//proccesing section
	sr.avg=(sr.pMarks+sr.tMarks)/2;
	//output section
	System.out.println();
	System.out.println("Dispaly student record :");
	System.out.println("------------------------");
	System.out.println("Student name\t\t\t: "+sr.studentName);
	System.out.println("Student index\t\t\t:"+sr.index);
	System.out.println("Student practical marks\t\t:"+sr.pMarks);
	System.out.println("Student theory marks\t\t:"+sr.tMarks);	
	System.out.println("Student average marks\t\t:"+sr.avg);
}
}
class StudentRecord{
	String studentName;//field1
	String index;//field2
	float pMarks;//field3
	float tMarks;//field4
	float avg;//field5
}

	