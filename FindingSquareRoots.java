import java.util.*;
import java.lang.*;
import java.io.*;

class FindingSquareRoots
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    System.out.println(Math.round(Math.sqrt(n)));
		}

	}
}
