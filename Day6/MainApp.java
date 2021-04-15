package Day6;

public class MainApp {
	public static void main(String[] args) {
		
		ElectronicDevice device[] = new ElectronicDevice[4000];
		device[0] = new MobilePhone();
		device[1] = new Printer();
		device[2] = new Laptop();
		device[3] = new Camera();
		
		doThings(device[0]);
		doThings(device[1]);
		doThings(device[2]);
		doThings(device[3]);
	}
	
	public static void doThings(ElectronicDevice device)
	{
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.doCalling();
			phone.doCharging();
			phone.stopCharging();
		}
		if(device instanceof Printer)
		{
			((Printer)device).doPrinting("Hello im printer");
			
		}
		if(device instanceof Laptop) {
			((Laptop)device).doCharging();
		}
		if(device instanceof Camera) {
			((Camera)device).FlashOn();
		}
		device.doSwitchOff();
		
	}

}