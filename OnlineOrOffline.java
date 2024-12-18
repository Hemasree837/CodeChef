import java.util.*;
import java.lang.*;
import java.io.*;

class OnlineOrOffline
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    double o=n-(0.10*n);
		    if(o<m)
		    System.out.println("ONLINE");
		    else if(o==m)
		    System.out.println("EITHER");
		    else
		    System.out.println("DINING");
		}

	}
}
