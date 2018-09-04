package testpackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		String s=new String();
		//System.out.println("dzdfsFssf");
		
			s=sc.next();
			//System.out.println(s);
		
		
		//System.out.println("dsf");
		String backup=new String(s);
		System.out.println("backup is = "+backup);
		StringBuffer sb=new StringBuffer(s);
		String reverse=new String(sb.reverse());
		System.out.println("reversed is = "+reverse);
		
		if(backup.equals(reverse))
		{
			System.out.println("Entered input is a palindrome");
			
		}
		else
		{
			System.out.println("Entered input is not a palindrome");
		}

	}

}
