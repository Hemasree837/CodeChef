import java.util.*;
import java.lang.*;
import java.io.*;

class Netflix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int x=sc.nextInt();
		    int h=a+b;
		    int k=b+c;
		    int j=c+a;
		    if(k>=x || j>=x || h>=x)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
