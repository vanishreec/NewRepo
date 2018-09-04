package testpackage;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		System.out.println("enter the input");
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		System.out.println("AT GIT");
		System.out.println("AT GIT2");
		System.out.println("new");
	}
}
