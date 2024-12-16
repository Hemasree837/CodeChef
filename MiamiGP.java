import java.util.*;
import java.lang.*;
import java.io.*;

class MiamiGP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    float x=sc.nextFloat();
		    float y=sc.nextFloat();
		    float f=x*1.07f;
		    if(y<=f)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
