package busreserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {

	String passengerName;
	int busNo;
	Date date; 
	
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name: ");
		passengerName=sc.next();
		System.out.print("Enter Bus No: ");
		busNo=sc.nextInt();
		System.out.print("Enter date dd-mm-yyyy: ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
			} catch (ParseException e) {
				System.out.println("your date formate is Wrong..");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isavailable(ArrayList<Bus> buses,ArrayList<Booking>bookings) {
		// TODO Auto-generated method stub
		int capacity=0;
		for(Bus bus: buses) {
			if(bus.getBusNo()==busNo)
				capacity=bus.getcapacity();
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;	
		
		
	}
}
