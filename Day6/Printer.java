package Day6;

public class Printer extends ElectronicDevice implements Bluetooth{

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSwitchOn() {
		
		System.out.println("Printer SwitchOn");
	}

	@Override
	public void doSwitchOff() {
	
		
	}

	public void doPrinting(String file)
	{
		System.out.println(file);
	}
}
