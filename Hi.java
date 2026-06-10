class Hi
{
	
		int x=10;
		static int  y=101;
		
	public void Bye()
	{
		System.out.println(x);
	}
	
	public static void main (String args[])
	{
		
	     Hi hi= new Hi();
		hi.Bye();
		hi.Bye();
	}
}
