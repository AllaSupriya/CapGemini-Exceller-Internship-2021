package Day7;


public class BookingService {
	
	public void doBooking(int count)throws BookingException
	{
		if(count<6)
		{
			 // book the tickets 
			System.out.println("book the tickets : Executed !!! ");
		}
		else
		{
			// raised the exception
			throw new BookingException(" Cannot book more than 6 "+count);
		}
		
	}

}