import java.util.*;
import java.lang.*;
import java.io.*;

class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    if (a%2==0)
		    evencount++;
		    else
		    oddcount++;
		}
        if(evencount>oddcount)
        System.out.println("READY FOR BATTLE");
        else
        System.out.println("NOT READY");
	}
}
