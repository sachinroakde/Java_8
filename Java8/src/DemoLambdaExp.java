interface Exp
{
	//void display();
	void display(int a);
	//System.
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
