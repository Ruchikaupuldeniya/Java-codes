import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class JavaTextFileWriting{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a text to writing on a file :");
		String text=sc.nextLine();
		File file =new File("String.txt");
		try{
		FileWriter fw =new FileWriter(file,true);
		BufferedWriter bf =new BufferedWriter(fw);
		bf.write(text+"\n");
		bf.close();
		}catch(IOException e){
			System.out.println("ERROR : "+e.toString());
			System.out.println("File writing problem");
		}
			
	}
}