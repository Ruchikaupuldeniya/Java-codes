public class AThread extends Thread{
	String name;
	public static void main(String[]args){
		AThread n1=new AThread("Kamal");
		AThread n2=new AThread("Nimal");
		AThread n3=new AThread("Mala");
		n1.start();
		n2.start();
		n3.start();
	}
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println(i+"->"+name);
		}
	}
	public AThread(String name){
		this.name=name;
	}
}