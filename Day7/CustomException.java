package Day7;

public class CustomException {

	public static void main(String[] args) {
		
		BookingService service = new BookingService();
		
		try
		{
			
			service.doBooking(5);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
}
