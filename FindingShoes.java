import java.util.*;
import java.lang.*;
import java.io.*;

class FindingShoes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n<m)
            System.out.println(2*n-n);
            else
            System.out.println(2*n-m);
        }
	}
}
