import java.util.*;

public class vector
{
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args)
	{
		Vector v = new Vector(3,2);
		print(v);
		v.add(0,2);
		v.add(1,2);
		v.add(2,2);
		print(v);
	}
}