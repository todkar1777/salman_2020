package Interface_ImplementationClass;

//sub class or implementation class
public class demo2 implements I1,I2
{
	public void m1()
	{
		System.out.println("method m1 from I1 completed in IC");
	}
	
	public void m2()
	{
		System.out.println("method m2 from I1 completed in IC");
	}
	
	public void m3()
	{
		System.out.println("methiod m3 from I2 completed in IC");
	}
	
	public void m4()
	{
		System.out.println("method m4 from I2 completed in IC");
	}
}
