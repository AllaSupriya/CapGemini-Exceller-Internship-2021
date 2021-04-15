package Day7_Lab5;

public class NameException extends Exception {

	public NameException() {
		super();
	}


	public NameException(String string) {
		super(string);
		System.out.println(string);
	}


	@Override
	public String toString() {
		return "Name Exception";
	}

}
