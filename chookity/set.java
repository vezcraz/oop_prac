import java.util.*;
public class set
{
	//hashset
	public static void print(Object s) { System.out.println(s); }
	public static void main(String args[])
	{
		HashSet<String> h = new HashSet<String>();
		h.add("India");
		h.add("Africa");
		h.add("USA");
		h.add("Sweden");
		h.add("Sweden");

		print(h);
		h.remove("India");
		print(h);

		Iterator<String> itr = h.iterator();
		while(itr.hasNext())
		{
			print(itr.next());

		}
		print("");
		for(String s: h)
		{
			print(s);
			
		}

		
	}
	



}