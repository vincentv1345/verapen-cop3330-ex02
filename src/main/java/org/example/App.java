package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the input string?: " );
        Scanner stringNum = new Scanner(System.in);
        String str = stringNum.next();
        StringLength length = new StringLength();
        String strLength = length.count(str);
        System.out.println(strLength);


    }
}
