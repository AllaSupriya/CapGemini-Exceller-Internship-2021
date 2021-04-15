package Day6;

public class MobilePhone extends ElectronicDevice implements Wifi,Bluetooth,Flash{

	@Override
	public void doSwitchOn() {
		
		// --- how to switch on mobile phone
		System.out.println("Mobile Phone SwitchOn");
	}

	@Override
	public void doSwitchOff() {
		System.out.println("Mobile Phone SwitchOff");
		
	}

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		
	}

	public void doCalling()
	{
		System.out.println("Mobile Phone is on call\n ");
	}

	@Override
	public void FlashOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FlashOff() {
		// TODO Auto-generated method stub
		
	}

	
}