package javapackage;

public class Log5_Constructor 
{
	public Log5_Constructor()
	{
		System.out.println("Default Constructor");
	}
	public Log5_Constructor(int a)
	{
		System.out.println("One Parameterized Constructor");
	}
	public Log5_Constructor(int a, int b)
	{
		System.out.println("Two Prarameterized Constuctor");
	}
	public static void main(String[] args) 
	{
	Log5_Constructor dg=new Log5_Constructor(5, 3);
	}
}
