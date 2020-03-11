import java.util.*;

public class EmpComp implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
	{
		return a.getId() - b.getId();
	}
}