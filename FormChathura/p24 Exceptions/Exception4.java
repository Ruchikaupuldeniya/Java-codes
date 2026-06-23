public class Exception4{
	public static int[] no;
	public static void main(String[] args){
		int a=10;int b=0;int c=5;
		try{
			System.out.println("Hello 1");
			m2(a,b,c);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR 01 : "+e.toString());

		}catch(ArithmeticException e){
			System.out.println("ERROR 02 : "+e.toString());
		}
		System.out.println("Hello 2");
	
	}
	public static void m2(int i1,int i2, int i3) throws ArrayIndexOutOfBoundsException,ArithmeticException{
		System.out.println("The division value is "+i1/i2);
		System.out.println("Hello 3");
		m1(i3);
		System.out.println("Hello 4");
	}	
	public static void m1(int index) throws ArrayIndexOutOfBoundsException{
		no = new int[5];
		System.out.println("The value in the element 6 is "+no[index]);
	}	
}

/* run -->
	Hello 1
	ERROR 02 : java.lang.ArithmeticException: / by zero
	Hello 2
*/
//higherachi 1k wdyta ArithmeticException 1k mulin enne