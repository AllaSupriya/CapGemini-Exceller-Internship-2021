package FlightApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TravelApp {	
	
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods*/
		Scanner sc=new Scanner(System.in);
		FlightDetails fd=new FlightDetails();		
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		Flight f=new Flight("R35007","Indigo Airlines","India",LocalDateTime.parse("06-04-2021 07:00", format),"Nepal",LocalDateTime.parse("06-04-2021 08:30" , format),false,5000);
		
		
		/*System.out.println("Enter FLight Number");
		String fn = sc.nextLine();
		System.out.println("Enter Airliner Name");
		String an = sc.nextLine();
		System.out.println("Enter Source");
		String s = sc.nextLine();
		System.out.println("Enter Departure Date and Time");
		LocalDateTime dd = LocalDateTime.parse(sc.nextLine(), format);
		System.out.println("Enter Destination");
		String dest = sc.nextLine();
		System.out.println("Enter Arrival Date and Time");
		LocalDateTime da = LocalDateTime.parse(sc.nextLine(), format);
		System.out.println("Enter Flight Type: international(True) or domestic(false)");
		boolean type = sc.hasNext();
		System.out.println("Enter Base Fare");
		int bf = sc.nextInt();
		LOOSER
		Flight f=new Flight(fn,an,s,dd,dest,da,type,bf);*/
		
		
		f.calculateCost();
		fd.printFlightDetails(f);	
	}
}


