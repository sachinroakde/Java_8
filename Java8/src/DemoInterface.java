/*
 * default and static methods in Interfaces
If you read forEach method details carefully, 
you will notice that it’s defined in Iterable interface 
but we know that interfaces can’t have method body. 
From Java 8, interfaces are enhanced to have method with
 implementation. We can use default and static keyword to 
 create interfaces with method implementation. forEach method 
 implementation in Iterable interface is:
 */
interface i1
{
	public static void add(int a,int b)
	{
		System.out.println(""+(a+b));
	}
	public default void sub(int a,int b)
	{
		System.out.println(""+(a-b));
	}
	
	public void mul(int a,int b);
	
}
public  class DemoInterface implements i1
{

	public void mul(int a,int b)
	{
		System.out.println(a*b);
		//return b;
	}
	public static void main(String[] args) 
	{
		DemoInterface i=new DemoInterface();
		i.sub(10,5);
		i1.add(10,5);
		i.mul(10,5);
	}

}
