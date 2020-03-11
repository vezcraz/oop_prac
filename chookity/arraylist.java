
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class arraylist
{
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args)
	{
		//creating array

		double data[] = new double[10];
		print(data.length);
		data[0] = 5.44; //to fill the array

		//arraylist
		ArrayList<Integer> li = new ArrayList<Integer>(5);
		for(int i=0; i<5; i++)
		{
			li.add(i+1);
		}
		print(li);
		print(li.size());
		print(li.get(2)); //returns index 2 of the list
		li.set(2,100); //sets the index 2 as 100
		li.add(3,400); // inserts 400 at index 3
		print(li);
		li.remove(3); //removes index 3
		// li.remove(400);
		print(li);
		print(li.contains(100)); 
		li.ensureCapacity(20); //ensures that the array list can now hold up to 20 elements
		
	}

}