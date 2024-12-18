import java.util.*;
import java.lang.*;
import java.io.*;

class TheLastLevels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if(x<=3)
		    System.out.println(x*y);
		    else
		    System.out.println(x*y+((x-1)/3)*z);
		}

	}
}
