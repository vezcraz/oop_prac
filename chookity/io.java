import java.io.*;
class io
{
	public static void print(Object s) { System.out.println(s); }
    public static void main(String[] args)
    throws IOException
    {
        // byte from = (byte)args[0].charAt(0);
        // byte to = (byte)args[1].charAt(0);
        // byte x;
        // while((x = (byte)System.in.read()) != -1)
        //     System.out.write(x == from ? to :
        //                      x);

        // String c;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       	// while((c=(String)br.readLine()).length()!=0)
       	// {
       	// 	print(c);
       	// }

    	// File f = new File(".");
    	// String list[]  = f.list();
    	// print(list);
    	// for(int i = 0; i<list.length; i++)
    	// {
    	// 	print(list[i]);
    	// }

    	// InputStreamReader f = new FileReader("./set.java");
    	// int c;
    	// while((c= f.read())!=-1)
    	// 	print((char)c);
    	// f.close();

    	RandomAccessFile f1 = new RandomAccessFile("filea.txt", "r");
    	RandomAccessFile f2 = new RandomAccessFile("fileb.txt", "rw");
    	
    	byte buffer[] = new byte[(int)f1.length()];
    	buffer[0]=(byte)'x';
    	f1.readFully(buffer, 1 , bufsize-1);
    	f2.write(buffer, 0, bufsize);

    }
}