class Box extends Object{
	int h;
	int w;
	int l;
	
	Box(){
		this(1);
	}
	
	Box(int l){
		this(l,1);
	}
	
	Box(int l, int w){
		this(l,w,1);
	}
	
	Box(int l, int w, int h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	public String toString(){
		return "Length :"+l+" , Width : "+w+" , Height :"+h;
	}
	
}
class Main{
	public static void main(String args[]){
		Box b1 = new Box(10);
	    //System.out.println("Length :"+b1.l+" , Width : "+b1.w+" , Height :"+b1.h);
		System.out.println(b1);
	}
}