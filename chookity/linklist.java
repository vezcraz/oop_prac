import java.util.*;

public class linklist
{
	public static void print(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();		
		list.addFirst(21);
		list.addLast(30);
		list.removeFirst();
		print(list);
		print(list.getFirst());

		for(int i=0; i<5; i++)
			list.addLast(i*3);

		print(list);
		list.add(list.indexOf(3),7);
		list.remove(5);
		print(list);

		ListIterator<Integer> itr = list.listIterator();
		itr.next();
		itr.next();
		itr.add(27);
		print(list);

		while(itr.hasNext())
		{
			if(itr.next()==3)
				itr.remove();
		}
		print(list);


	}
}