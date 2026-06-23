public class Exception2{
	public static void main(String[] args){
		int[] no=new int[5];
		System.out.println("Hello1");
		try{
			System.out.println("The value in the element 6 is "+no[5]);
			System.out.println("Hello2");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR : "+e.toString());
		}
		System.out.println("Hello3");
	}
}
/* run ---->
	Hello1
	ERROR : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	Hello3
*/