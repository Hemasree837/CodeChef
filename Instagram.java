import java.util.*;
import java.lang.*;
import java.io.*;

class Instagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x>10*y) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}


