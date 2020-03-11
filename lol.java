public class lol{
	public static void main(String args[])
	{
		try
		{
			foo(5,0);

		}
		// catch(ArithmeticException e)
		// {
		// 	System.out.println("Arithmetic");
		// }
		catch(NullPointerException e)
		{
			System.out.println("Exception");

		}

	}

	public static void foo(int a, int b) throws Exception
	{
		try
		{
			System.out.println("Try block");
			int c=a/b;
		}
		catch (NullPointerException e)
		{
			System.out.println("lol");
			throw new ArithmeticException();
		}
		finally
		{
			System.out.println("finally");
		}
	}
}