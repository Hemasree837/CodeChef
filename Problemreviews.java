import java.util.*;
import java.lang.*;
import java.io.*;

class Problemreviews
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    boolean good=true;
		    for(int i=0;i<n;i++)
		    {
		        int s=sc.nextInt();
		        if(s<=4)
		        good=false;
		    }
		    if(good)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}

	}
}
