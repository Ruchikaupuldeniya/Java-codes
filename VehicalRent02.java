import java.util.Scanner;

abstract class Vehicle
{
	protected int vid;
	protected int year;
	protected String model;
	protected double rentalrate ;
	
	Vehicle(int vid,int year,String model,double rentalrate)
	{
		this.vid=vid;
		this.year=year;
		this.model=model;
		this.rentalrate=rentalrate;
	}
	
	abstract void calculateRentalCost( int days );
	public String toString ()
	{
		return vid+" "+year+ " "+model;
	}
}


class Car extends Vehicle
{
	
	Car (int vid,int year,String model,double rentalrate)
	{
		super(vid, year, model, rentalrate);
	}
	public void calculateRentalCost(int days )
	{
		double cost=rentalrate*days;
		System.out.println("your rent for car: "+cost);
	}
}


 class Truck extends Vehicle
{
	
	Truck (int vid,int year,String model,double rentalrate)
	{
		super(vid, year, model, rentalrate);
	}
	public void calculateRentalCost(int days )
	{
		double cost=rentalrate*days+((rentalrate*days)*0.1);
		System.out.println("your rent for Truck: "+cost);
	}
}


 class Motorcycle extends Vehicle
{
	
	Motorcycle (int vid,int year,String model,double rentalrate)
	{
		super(vid, year, model, rentalrate);
	}
	public void calculateRentalCost(int days )
	{
		if (days>7)
		{	
			double cost=(rentalrate*days)-((rentalrate*days)*0.2);
			System.out.println("your rent for Motorcycle: "+cost);
		}
		else 
		{
			double cost=rentalrate*days;
			System.out.println("your rent for Motorcycle: "+cost);
			
		}
	}
}

 class  VehicalRent02
{
	public static void main (String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter your vehicale type : ");
		String name =sc.nextLine();
		
		System.out.print("enter your days of rent: ");
		int days = sc.nextInt();
		
		Car c1=new Car(00301,2002,"civic",20000.00);
		Truck t1 = new Truck(00311,2004,"New model",3000.00);
		Motorcycle m1=new Motorcycle(00321,2005,"New moddel",4000.00);
		
		if(name.equalsIgnoreCase("car"))
		{
			c1.calculateRentalCost(days);
		}
		else if(name.equalsIgnoreCase("Truck"))
		{
			t1.calculateRentalCost(days);
		}
		else if(name.equalsIgnoreCase("motorcycle"))
		{
			m1.calculateRentalCost(days);
		}
		else 
		{
			System.out.println(" you entered vehicle type is invalid try agian!!!!");
		}
		
	}
}