import java.io.*;
import java.awt.*;
public class writer
{
public static void main( String args[ ] ) throws IOException
 {
 PrintWriter outfile = new PrintWriter(
 new BufferedWriter(
 new FileWriter(
 new File( "pricelist.txt" ) ) ) );

 outfile.println( "Sugar" );
 outfile.println( "0.84" );
 outfile.println( "Butter" );
 outfile.println( "1.02" );
 outfile.close( );
 System.exit( 0 );
 }
}