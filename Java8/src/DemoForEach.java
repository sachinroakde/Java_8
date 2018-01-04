import java.util.ArrayList;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args)
	{
			List<Integer> ar=new ArrayList<Integer>();
			System.out.println("sa;lksla");

			ar.add(1);
			ar.add(1);
			ar.add(1);
			ar.add(1);
			
			ar.forEach(System.out::println); //lambda exp

	}

}
