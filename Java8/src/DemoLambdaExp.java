interface Exp
{

	void display(int a);

}
public class DemoLambdaExp 
{

	public static void main(String[] args) 
	{
		Exp e;
		e =i -> System.out.println("Lambada "+i);


		e.display(1);
	}

}
