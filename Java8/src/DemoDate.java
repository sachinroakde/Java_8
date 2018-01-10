import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

/*
 * Problem in Date class aboue 7 vrsion
 * 		same date class in util and sql package
 * 		date class not thread safe
 */

public class DemoDate 
{

	public static void main(String[] args) 
	{
		Date d=new Date();              		//jdk 7 date +time
		System.out.println(d);
		
		LocalDate ld=LocalDate.now();          //jdk 8  only date
		System.out.println(ld);
		
		LocalTime lt=LocalTime.now();			//jdk8 only time
		System.out.println(d);
		
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
