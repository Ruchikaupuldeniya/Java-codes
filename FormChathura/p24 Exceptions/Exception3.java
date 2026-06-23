public class Exception3{
	public static int[] no;
	public static void main(String[] args){
		System.out.println("Hello1");
		try{
			m1(5);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR : "+e.toString());
		}
		System.out.println("Hello2");
		System.out.println("Hello3");
	}
	public static void m1(int index) throws ArrayIndexOutOfBoundsException{
		no = new int[5];
		System.out.println("The value in the element 6 is "+no[index]);
	}	
}

/*run --->
	Hello1
	ERROR : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	Hello2
	Hello3
*/