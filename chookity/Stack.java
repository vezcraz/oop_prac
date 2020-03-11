import java.util.*;
public class Stack
{
	public static void print(Object o){
		System.out.println(o);
	}
	private ArrayList<Integer> li;

	public Stack()
	{
		li = new ArrayList<Integer>();
	}

	public void pop()
	{
		
			li.remove(li.size()-1);
		
	}
	public void push(int val)
	{
		li.add(val);
	}
	public void display()
	{
		print(li);
	}


}