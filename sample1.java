package This_and_Super_keyword;

public class sample1 extends sample2
{

	//int a=51;  //global variable from super class
	
	int a=20; 	//global variable from same class
	int b=50;
	
	public void m1()
	{
		int a=10;
		System.out.println(a);			//10	local variable
		System.out.println(this.a);		//20	global variable
		System.out.println(super.a);	//51	global variable from super class
	}
	
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		s1.m1();
	}
}
