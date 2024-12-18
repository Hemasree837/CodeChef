import java.util.*;
import java.lang.*;
import java.io.*;

class SelfDefenceTraining
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        int a=sc.nextInt();
		        if(a>=10 && a<=60)
		        {
		            c++;
		        }
		    }
		    System.out.println(c);
		}

	}
}
