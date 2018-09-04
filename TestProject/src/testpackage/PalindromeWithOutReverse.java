package testpackage;

import java.util.Scanner;

public class PalindromeWithOutReverse
{
	public static void main(String[] args)
	{
		System.out.println("enter the input");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		String s1=new String();
		for(int i=(len-1);i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		{
			System.out.println("entered is a palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
