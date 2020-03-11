import java.util.*;
public class scanner
{
    public static void print(Object o)
    {
        System.out.println(o);
    }

    public static void main(String[] args) throws InputMismatchException
    {
        Scanner scan = new Scanner(System.in);
        int a = 1;
        String str;

        while(scan.hasNextLine() && !((str = scan.nextLine()).equals("exit")))
        {
            try
            {
                a *= scan.nextInt();
                // print(a);
            }
            catch(Exception e)
            {
                String flush = scan.next();
               
              
            }
        }
        print(a);
    }
}