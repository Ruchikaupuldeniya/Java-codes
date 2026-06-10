import java.util.Scanner;
abstract class FoodOrder{
	protected String foodName;
	protected double basePrice;
	protected int deliveryTime;
	
	FoodOrder(String foodName,double basePrice,int deliveryTime){
		this.foodName = foodName;
		this.basePrice = basePrice;
		this.deliveryTime = deliveryTime;
	}
	
	abstract void calculateTotalCost();
	abstract void getOrderDetails();
}

class Pizzaorder extends FoodOrder{
	private int extraTopping;
	private final static double EXTRA_CHARGE = 200;
	Pizzaorder(String foodName,double basePrice,int deliveryTime){
		super(foodName,basePrice,deliveryTime);
	}
	
	void calculateTotalCost(){
		Scanner input  = new Scanner(System.in);
		System.out.print("Extra Topping : ");
		extraTopping = input.nextInt();
		
		double total = basePrice + (extraTopping * EXTRA_CHARGE);
		System.out.println("Total Cost : "+total);
	}
	
	void getOrderDetails(){
		System.out.println("Food Name : "+foodName);
		System.out.println("BasePrice : "+basePrice);
		System.out.println("DeliveryTime : "+deliveryTime);
		System.out.println("Extra Topping : "+extraTopping);
	}
}

class SandwitchOrder extends FoodOrder{
	private int extraFilling;
	private final static double EXTRA_CHARGE = 150;
	SandwitchOrder(String foodName,double basePrice,int deliveryTime){
		super(foodName,basePrice,deliveryTime);
	}
	
	void calculateTotalCost(){
		Scanner input  = new Scanner(System.in);
		System.out.print("Extra Filling : ");
		extraFilling = input.nextInt();
		
		double total = basePrice + (extraFilling * EXTRA_CHARGE);
		System.out.println("Total Cost : "+total);
	}
	
	void getOrderDetails(){
		System.out.println("Food Name : "+foodName);
		System.out.println("BasePrice : "+basePrice);
		System.out.println("DeliveryTime : "+deliveryTime);
		System.out.println("Extra Filling : "+extraFilling);
	}
}

class SaladOrder extends FoodOrder{
	private String isLarge;
	
	SaladOrder(String foodName,double basePrice,int deliveryTime){
		super(foodName,basePrice,deliveryTime);
		this.isLarge = isLarge;
	}
	
	void calculateTotalCost(){
		Scanner input  = new Scanner(System.in);
		System.out.print(" Portion : ");
		isLarge = input.nextLine();
		
		double total = 0;
		if(isLarge.equals("large")){
			total = basePrice - (basePrice * 0.1);
		}else {
			total = basePrice;
		}
		
		System.out.println("Total Cost : "+total);
	}
	
	void getOrderDetails(){
		System.out.println("Food Name : "+foodName);
		System.out.println("BasePrice : "+basePrice);
		System.out.println("DeliveryTime : "+deliveryTime);
		System.out.println("Portion : "+isLarge);
	}
}






class  FoodOrderApp{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Food Name : ");
		String name = input.nextLine();
		
		
		if(name.equalsIgnoreCase("pizza")){
			Pizzaorder pizza = new Pizzaorder("Pizza 001", 2000, 20);
			pizza.calculateTotalCost();
			pizza.getOrderDetails();
		}else if(name.equalsIgnoreCase("sandwich")){
			SandwitchOrder sand = new SandwitchOrder("Sand 001",250,10);
			sand.calculateTotalCost();
			sand.getOrderDetails();
		}else if(name.equalsIgnoreCase("salad")){
			SaladOrder salad = new SaladOrder("Salad 001",650,15);
			salad.calculateTotalCost();
			salad.getOrderDetails();
		}else{
			System.out.println("");
		}
	}
}