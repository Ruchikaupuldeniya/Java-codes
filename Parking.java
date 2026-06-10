class Car{
	String brand;
	Tyre t;
}

class Tyre{
	public void printTyre(){
		System.out.println("hi");
	}
	
}

class Parking{
	public static void main(String args[]){
		Car car = new Car();
		car.t = new Tyre();
		car.t.printTyre();
	}
}