import java.util.Scanner;

abstract class Vehicale
{
	protected int vid;
	protected int year;
	protected String model;
	protected double rentalrate;
	
	Vehicale(int vid,int year,String model,double rentalrate)
	{
		this.vid=vid;
		this.year=year;
		this.model=model;
		this.rentalrate=rentalrate;
	}	
    void calculateRentalCost(int days)
	{}
	public String toString()
	{
		return vid+" "+year+" "+model;
	}
	
}

class Car extends Vehicale
{
	Car (int vid,int year,String model,double rentalrate)
	{
		super(vid,year,model,rentalrate);
	}
	
	void calculateRentalCost(int days)
	{
		double cost =rentalrate*days;
		System.out.println("your total cost for car :"+cost);
	}
}

class Truck extends Vehicale
{
	Truck(int vid,int year,String model,double rentalrate)
	{
		super(vid,year,model,rentalrate);
	}
	void calculateRentalCost(int days)
	{
		double cost=rentalrate*days+((rentalrate*days)*0.1);
		System.out.println("your total cost for TRuck : "+cost);
		
	}
}
class Motorcycle extends Vehicale
{
	Motorcycle(int vid,int year,String model,double rentalrate)
	{
		super(vid,year,model,rentalrate);
	}
	void calculateRentalCost(int days)
	{
		if(days>7)
		{	
			double cost=rentalrate*days-((rentalrate*days)*0.2);
			System.out.println("your total cost for TRuck : "+cost);
		}
		else
		{
			double cost=rentalrate*days;
			System.out.println("your total cost for TRuck : "+cost);
		}
	}
}
	
public class VehivalRentalSystem
	{
		public static void main (String [] args)
		{
			Scanner scan=new Scanner(System.in);
			
			
			
			System.out.println("Enter your vehical type: ");
			String name =scan.nextLine();
			
			System.out.println("Enter your number of days : ");
			int days =scan.nextInt();
			
			Vehicale c1=new Car(11,2000,"civic",1000.0);
			Vehicale t1=new Truck(22,3000,"new",2000.0);
			Vehicale m1=new Motorcycle(33,40000,"old",3000.0);
			
			if (name.equalsIgnoreCase("car"))
			{
				c1.calculateRentalCost(days);
		
				
				
			}
			else if (name.equalsIgnoreCase("truck"))
			{
				t1.calculateRentalCost(days);
			}
			else if (name.equalsIgnoreCase("motorcycle"))
			{
				m1.calculateRentalCost(days);
			}
			else 
			{
				System.out.println("Wrong input vehical type");
			}
			
		}		
	}
