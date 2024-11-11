package TRAVEL;
import java.util.*;
public class MASTER 
{
	public static void main(String[] args)
	{
		ArrayList<BUS> Buses = new ArrayList<> ();
		ArrayList<BOOKING> Bookings = new ArrayList<> ();
		
		Buses.add(new  BUS(1,true,3));
		Buses.add(new  BUS(2,true,50));
		Buses.add(new  BUS(3,true,87));
		
		for(BUS b: Buses)
		{
			b.display();
		}
		
		Scanner sc=new Scanner(System.in);
		int ch=1;
		while(ch==1)
		{
			System.out.println("===================================================");
			System.out.println("Enter 1 for Booking and 2 for exit ");
			ch=sc.nextInt();
			
			if(ch==1)
			{
				BOOKING book = new BOOKING(sc);
				
				if(book.isavailable(Buses,Bookings))
				{
					System.out.println("TICKET BOOKING IS CONFIRMED");
					Bookings.add(book);
				}
				
				else
				{
					System.out.println("TICKET BOOKING IS NOT CONFIMED");
				}
			}
		}
		sc.close();
	}
}