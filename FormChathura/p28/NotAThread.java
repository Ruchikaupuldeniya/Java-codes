public class NotAThread{
	String name;
	public static void main(String[]args){
		NotAThread n1=new NotAThread("Kamal");
		NotAThread n2=new NotAThread("Nimal");
		NotAThread n3=new NotAThread("Mala");
		n1.method(n1.name);
		n2.method(n2.name);
		n3.method(n3.name);
	}
	public void method(String s){
		for(int i=1;i<10;i++){
			System.out.println(i+"->"+s);
		}
	}
	public NotAThread(String name){
		this.name=name;
	}
}