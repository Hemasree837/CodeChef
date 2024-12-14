import java.util.*;
import java.lang.*;
import java.io.*;

class HealthySleep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==8) System.out.println("PERFECT");
		else if(a<8) System.out.println("LESS");
		else System.out.println("MORE");

	}
}
