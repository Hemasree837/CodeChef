import java.util.*;
import java.lang.*;
import java.io.*;

class Chessboard
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int x1=sc.nextInt();
		    int y1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y2=sc.nextInt();
		    System.out.println(Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));
		}

	}
}
