package testpackage;

public class PrimeNum
{
	int num=0;
	int sq=0;
	int reqnum=0;
	
	String retfun(int num)
	{
		this.num=num;
		for(int i=2;i<num;i++)
		{
			sq=(i*i);
			if(sq>=num)
			{
				reqnum=i;
				break;
			}
				
		}
		System.out.println("reqnum is"+sq);
		System.out.println("reqnum is"+reqnum);
		for(int j=2;j<reqnum;j++)
		{
			if(num%j==0)
			{
				return "not prime";
			}
		}
		return "is prime";
	}
	public static void main(String args[])
	{
		PrimeNum obj=new PrimeNum();
		System.out.println(obj.retfun(811));
	}

}
