import java.util.*;
import java.lang.*;
import java.io.*;

class DiwaliDiscount
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int gift=sc.nextInt();
		int voc=sc.nextInt();
		if (gift>voc)
		System.out.println(gift-voc);
		else
		System.out.println(0);

	}
}
