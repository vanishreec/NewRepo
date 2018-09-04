package testpackage;

import java.util.Scanner;

public class Start
{
	public static void main(String[] args)
		{
		  int a=0;
		  int b=1;
		  int c=0;
		  System.out.print("Please enter the count");
		 
		
		  
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		 System.out.print(a+","+b+",");
		  for(int i=0;i<(j-2);i++)
		  {
			  c=a+b;
			  if(i!=(j-3))
			  {
			  System.out.print(c+",");
			  }
			  else
			  {
				  System.out.print(c);
			  }
			  a=b;
			  b=c;
		  }
		
		
		}

}
