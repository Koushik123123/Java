class two 
{
	public static void main(String args[])
	{
		try 
		{
			try 
			{
				int a[]={1,2,3};
				System.out.println(a[4]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Out of bounds");
			}
			System.out.println(3/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
	}
}
