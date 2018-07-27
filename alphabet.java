import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		System.out.println("it is character");
		else
		System.out.println("it is not a character");
		
	}
}
