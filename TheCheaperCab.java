import java.util.*;
import java.lang.*;
import java.io.*;

class TheCheaperCab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x<y) System.out.println("FIRST");
		    else if(x==y) System.out.println("ANY");
		    else System.out.println("SECOND");
		}

	}
}