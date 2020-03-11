import java.util.*;

public class hashmap
{
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args)
	{
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		// h.add(2,"lol");
		h.put(1,"lol");
		h.put(5, "hahaha");
		print(h); //retuns entrySet values with curl braces
		print(h.get(2));
		print(h.keySet());
		print(h.entrySet());
		print(h.values());

		Collection<String> x = h.values();
		Iterator itr =  x.iterator();

		while(itr.hasNext())
		{
			print(itr.next());
		}
		print("");
		h.remove(1);
		print(h.values());


		//using keySet to traverse hashmap
		// Set<Integer> box = h.keySet();
		// print(box);
		for(Integer m: h.keySet())
		{
			print(h.get(m));
		}
	}

}