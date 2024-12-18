import java.util.*;
import java.lang.*;
import java.io.*;

class ElectionsInChefLand
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int c=0;
		    for(int j=0;j<n;j++)
		    {
		        int i=sc.nextInt();
		        if (i>=x)
		        c++;
		    }
		    System.out.println(c);
		}

	}
}
