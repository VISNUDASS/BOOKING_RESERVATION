package TRAVEL;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class BOOKING 
{
	String name;
	int busno;
	Date date;
	
	BOOKING(Scanner sc)
	{
		System.out.println("Enter Passenger name: ");
		name=sc.next();
		System.out.println("Enter Bus No: ");
		busno=sc.nextInt();
		System.out.println("Enter Date in(DD-MM-YYYY) : ");
		String n = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
		
		try
		{
			date=sdf.parse(n);
		}
		
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
		
		public boolean isavailable(ArrayList<BUS> Buses, ArrayList<BOOKING> Bookings)
		{
			int booked=0;
			int capacity=0;
			for(BUS aa: Buses)
			{
				if(aa.get_busno()==busno)
				{
					capacity = aa.get_capacity();
				}
			}
			for (BOOKING bb : Bookings)
			{
				if(bb.busno==busno && bb.date.equals(date))
				{
					booked++;
				}
			}
			return booked<capacity;
		}
	}
