import java.util.*;

public class lol
{
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Vezcraz", 32, 500000);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.addAll(Arrays.asList(empArr));
        Collections.sort(list, new EmpComp());
        print(list);

	}
}