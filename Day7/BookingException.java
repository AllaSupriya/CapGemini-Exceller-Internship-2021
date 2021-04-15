package Day7;

public class BookingException extends Exception{
	
	private String excMsg = "";

	public BookingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "Booking Exception :- "+excMsg;
	}
	


}