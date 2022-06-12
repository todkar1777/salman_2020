package Inheritance;

public class Hirarchicle_Inheritance 
{

	public static void main(String[] args)
	{
		System.out.println("Properties of son1-->");
		son1 s1=new son1();
		s1.laptop();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("Properties of son2-->");
		son2 s2=new son2();
		s2.bike();
		s2.car();
		s2.money();
		s2.home();
	}
}
