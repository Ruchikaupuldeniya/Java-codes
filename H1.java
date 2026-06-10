import java.util.Scanner;

public class H1
{
	public static void main(String [] args)
	{
		int n;
		System.out.println("Enter your array size");
		
		Scanner input= new Scanner(System.in);
		n=input.nextInt();
		String [] a = new String [n];
		
		System.out.println("Enter your array element");
		for (int i=0;i<n;i++)
		{
			a[i]=input.nextLine();
		}
		System.out.println(" your array ");
		for (String element :a)
		{
			System.out.print(element);
		}
	}	
		
		
		
	}
	/*

import java.util.Scanner;

public class H1
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter your array size:");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        String[] a = new String[n]; // Declare the string array

        System.out.println("Enter your array elements (one per line):");
        for (int i = 0; i < n; i++)
        {
            a[i] = input.nextLine(); // Read each string input
        }

        System.out.println("Your array elements are:");
        for (String element : a) // Enhanced for loop for better readability
        {
            System.out.println(element); // Print each element in a new line
        }
        
        //input.close(); // Close the scanner to avoid resource leak
    }
}
*/