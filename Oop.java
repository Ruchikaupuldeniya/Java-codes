import java.util.Scanner;
public class Oop
{
	String name;
	String color;
	int storage;
	
	public void call()
	{
		System.out.println("take a call form "+name);
	}
	public void massage()
	{
		System.out.println("take a massage from:"+color);
	}
	
	public static void main (String args [])
	{
		Oop phone1 = new Oop();
		phone1.name="Samsung";
		phone1.call();
	}
}