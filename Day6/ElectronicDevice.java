package Day6;

public  abstract class ElectronicDevice {

	static int f=0;
	public abstract void doSwitchOn();
	
	public abstract void doSwitchOff();
	
	public void doCharging() {
		if(f==0) {
			f=1;
			System.out.println("Device started charging");
		}else {
			System.out.println("already one device is connected");
		}
	}
	
	public void stopCharging() {
		if(f==1) {
			f=0;
			System.out.println("Device stopped charging");
		}else {
			System.out.println("no device is connected");
		}
	}
}