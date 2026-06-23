public class Exception1{
	public static void main(String[] args){
		int x=10;
		int y=0;
		System.out.println("Hello1");
		try{
			System.out.println("The result is "+x/y);
			System.out.println("Hello2");
		}catch(ArithmeticException e){
			System.out.println("ERROR :y = 0");
			System.out.println("Error message og the object is :"+e.toString());
		}
		System.out.println("Hello3");
	}
}




/*run --->
	Hello1
	ERROR :y = 0
	Error message og the object is :java.lang.ArithmeticException: / by zero
	Hello3

error 1kt yata tika run wenne handle karoth wtri
*/
