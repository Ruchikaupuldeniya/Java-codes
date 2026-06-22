
public class MethodOverloading1{
	public static void main(String[]args){
	varMethod(10,15,145,54,56);
	}
	static void varMethod(int ...no){
		for(int i=0;i<no.length;i++){
		System.out.println("The argument list is "+no[i]);
		}
	}
}

// D:\Chathura\java\p21>javac MethodOverloading1.java

// D:\Chathura\java\p21>java MethodOverloading1
// The argument list is 10
// The argument list is 15
// The argument list is 145
// The argument list is 54
// The argument list is 56

 