package testpackage;

import java.util.Scanner;

public class Armstrong {

	
	public static void main(String[] args)
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int original=num;
		
		int sum=0;
		int cube1,cube2,cube3=0;
		String s=Integer.toString(num);
		System.out.println("num to string"+s);
		int len=s.length();
		System.out.println("number of digits is="+len);
		for(int i=0;i<len;i++)
		{
			char c=s.charAt(i);
			String s1=c+"";
			int inte=Integer.parseInt(s1);
			sum=sum+(inte*inte*inte);
			
			
		}
		System.out.println("sum is"+sum);
		if(original==sum)
		{
			System.out.println("is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
            
	}

}
