import java.util.*;
import java.lang.*;
import java.io.*;

class Judged
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t;i++){
		    int r1=sc.nextInt();
		    int r2=sc.nextInt();
		    int r3=sc.nextInt();
		    int r4=sc.nextInt();
		    int r5=sc.nextInt();
		    if(r1+r2+r3+r4+r5>=4)
		      System.out.println("Yes");
		      else
		      System.out.println("NO");
		}

	}
}
