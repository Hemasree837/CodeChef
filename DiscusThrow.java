import java.util.*;
import java.lang.*;
import java.io.*;

class DiscusThrow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a>=b && a>=c)
		    System.out.println(a);
		    else if(b>=a && b>=c)
		    System.out.println(b);
		    else
		    System.out.println(c);
		}

	}
}
