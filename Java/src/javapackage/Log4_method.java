package javapackage;

public class Log4_method 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum Reuslt is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is "+z);
		return z;
	}
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		System.out.println("Multiply Result is "+r);
		return r;
	}
	public void div(int r, int s)
	{
		int t;
		t=r/s;
		System.out.println("Division Result is "+t);
	}
	public static void main(String[] args) 
	{
	Log4_method dc=new Log4_method();
	int sumresult=dc.sum(10, 2);
	int sumresult2=dc.sum(sumresult, 2);
	int subresult=dc.sub(sumresult2, 2);
	int mulresult=dc.mul(subresult, 2);
	dc.div(mulresult, 2);
	}

}


