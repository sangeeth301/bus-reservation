package busreserv;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		ArrayList<Bus> buses=new ArrayList<Bus>();
		buses.add(new Bus(23,true,50));
		buses.add(new Bus(88,false,43));
		buses.add(new Bus(63,true,42));
		
		Scanner sc=new Scanner(System.in);
		int input=1;
		System.out.println("Available buses");
		for(Bus b: buses) {
			b.displayBusInfo();
		}
		
		while(input==1) {
			System.out.println("press 1 to continue 2 exit");
			input=sc.nextInt();
			if(input==1) {
				
				 Booking booking=new Booking();
					
				if(booking.isavailable(buses,bookings)){
					bookings.add(booking);
					System.out.println("Booking conformed..");					
					
				}
				else {
					System.out.print("something went wrong");
				}
			
			}
			
		}

	}

}
