package javapackage;

public class Log3_method 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum"+c);
		return c;
	}
	public int sub(int e, int f)
	{
		int g;
		g=e-f;
		System.out.println("sub"+g);
		return g;
	}
	public int mul(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("mul"+z);
		return z;
	}
	public static void main(String[] args) 
	{
		Log3_method lg=new Log3_method();
		int sumresult= lg.sum(10, 2);
		int subresult=lg.sub(10, 2);
		lg.mul(sumresult,subresult);

	}

}
