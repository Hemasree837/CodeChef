import java.util.*;
import java.lang.*;
import java.io.*;

class RightThere
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    if(n<=x) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}

