//Abstract class
public class Mainpro extends Test{
	public static void main(String[]args){
		System.out.println(myMethod());
	}
}
class Test{
	public static int myMethod(){
		MyClass mc= new MyClass();
		int largest=mc.Max(10,20);
		return largest;
	}
} 
interface AB{
	public int Max(int a,int b);
}
class  MyClass implements AB{
	public int Max(int a,int b){
		int max;
		if(a>b)
			max=a;
		else
			max=b;
	return max;
	}
}
	