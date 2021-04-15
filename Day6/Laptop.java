package Day6;

public class Laptop extends ElectronicDevice implements Wifi,Flash {

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub
		System.out.println("Laptop SwitchOn");

	}

	@Override
	public void doCharging() {
		// TODO Auto-generated method stub
		super.doCharging();
	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub
		System.out.println("Laptop SwitchOff");

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
