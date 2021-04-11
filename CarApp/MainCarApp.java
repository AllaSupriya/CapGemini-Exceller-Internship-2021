package CarApp;

import java.util.Scanner;

import Day4.Car;
import Day4.Engine;
import Day4.Music;

public class MainCarApp {

	static Scanner sc = new Scanner(System.in);
	Car carsInfo[] = new Car[1000000];   // Database or ArrayList or Set or Map
	int index = 0; // for car count
	int music[] = new int[1000000];
	
	public static void main(String[] args) {
		
		MainCarApp obj = new MainCarApp();
		
		while(true)	{

			System.out.println("-------------------------\n0. Exit");
			System.out.println("1. Add Car");
			System.out.println("2. View Car By Cost");
			System.out.println("3. View Car By Car Power");
			System.out.println("4. View Car By Car Name");
			System.out.println("5. View All Cars");
			System.out.println("6. Play Music By Car");
			System.out.println("7. Stop Music By Car");
			System.out.println("8. Cars with Music");
			System.out.println("9. Cars without Music");			
			
			int option = Integer.parseInt(sc.nextLine());
			
			switch(option) 	{
			
			case 1: obj.insertCarByUser();
					break;
					
			case 2: System.out.println(" Enter the Cost Limit ");
					int costLimit = Integer.parseInt(sc.nextLine());
					obj.viewCarsByCost(costLimit);
					break;
					
			case 3: System.out.println(" Enter the Power Limit ");
					int powerLimit = Integer.parseInt(sc.nextLine());
					obj.viewCarsByPower(powerLimit);
					break;
					
			case 4: System.out.println(" Enter the Car Name");
					String cname = sc.nextLine();
					boolean f = obj.viewCarsByName(cname);
					if(!f) System.out.println("Car not found");
					break;
					
			case 5: obj.viewAllCars();
					break;
					
			case 6: System.out.println(" Enter the Car Name in which music should be played");
					String cname1 = sc.nextLine();
					if (obj.viewCarsByName(cname1)) {
						System.out.println("Enter the Music System you want to use radio, Bluetooth, USB:");
						String musicSystem = sc.nextLine();
						obj.PlayMusicByCar(cname1,musicSystem);
					}else {
						System.out.println("Car not found");
					}
					break;
					
			case 7: System.out.println(" Enter the Car Name in which music should off");
					String cname2 = sc.nextLine();
					if (obj.viewCarsByName(cname2)) {
						System.out.println("Enter the Music System you want to use radio, Bluetooth, USB:");
						String musicSystem = sc.nextLine();
						obj.StopMusicByCar(cname2,musicSystem);
					}else {
						System.out.println("Car not found");
					}
					break;
					
			case 8: obj.getCarsWithMusicOn();
					break;
					
			case 9: obj.getCarsWithMusicOff();
					break;
					
			case 0: System.out.println("------THE END------");
					System.exit(0);
			
			default : System.out.println("Enter between 0-9");			
			}//end of swicth
		}//end while
	}//end main

	public void getCarsWithMusicOff() {
		int f=0;
		System.out.println("Cars with Music Off:");
		for(int i=0;i<index;i++) {
			if(music[i]==0) {
				f=1;
				displayCarInfo(carsInfo[i]);
			}
		}
		if(f==0) System.out.println("Not Found");
	}

	public void getCarsWithMusicOn() {
		int f=0;
		System.out.println("Cars with Music On:");
		for(int i=0;i<index;i++) {
			if(music[i]==1) {
				f=1;
				displayCarInfo(carsInfo[i]);
			}
		}
		if(f==0) System.out.println("Not Found");
	}

	public void StopMusicByCar(String cname2, String musicSystem) {
		for(int i =0;i<index;i++) {
			if(carsInfo[i].getCarName().toLowerCase().equals(cname2) && music[i] == 0) {
				System.out.println("No Music System is playing in "+cname2);
			}else if(carsInfo[i].getCarName().toLowerCase().equals(cname2)) {
				music[i] = 0;
				if(musicSystem.toLowerCase().equals("radio")) System.out.println("Radio is disconnected to "+cname2+" and music is stopped");
				else if(musicSystem.toLowerCase().equals("bluetooth"))  System.out.println("Bluetooth is disconnected to "+cname2+" and music is stopped");
				else if(musicSystem.toLowerCase().equals("usb") )System.out.println("USB is disconnected to "+cname2+" and music is stopped");
				else {
					System.out.println("Music System not found in "+cname2+" to stop");
				}
			}
		}
	}

	public void PlayMusicByCar(String cname1, String musicSystem) {
		for(int i =0;i<index;i++) {
			if(carsInfo[i].getCarName().toLowerCase().equals(cname1)&& music[i] == 1) {
				System.out.println("Some Music System is already playing in "+cname1);
			}else if(carsInfo[i].getCarName().toLowerCase().equals(cname1)) {
				music[i] = 1;
				if(musicSystem.toLowerCase().equals("radio")) PlayMusicByCarRadio(cname1);
				else if(musicSystem.toLowerCase().equals("bluetooth"))  System.out.println("Bluetooth is connected to "+cname1+" and playing music");
				else if(musicSystem.toLowerCase().equals("usb") )System.out.println("USB is connected to "+cname1+" and playing music");
				else {
					System.out.println("Music System not found in "+cname1+" to start");
				}
			}
		}
	}

	public void PlayMusicByCarRadio(String cname) {
		System.out.println("Enter radio station which you want to play :");
		double station = Double.parseDouble(sc.nextLine()); 
		if(new Music().doStartMusicByRadio(station)){
			System.out.println(cname+" is playing Music ");
		}else {
			System.out.println(" Radio Station not found in "+cname);
		}
	}
	
	public boolean viewCarsByName(String cname) {
		for(int i=0;i<index;i++) {
			if(carsInfo[i].getCarName().toLowerCase().equals(cname)) {
				displayCarInfo(carsInfo[i]);
				return true;
			}
		}
		return false;
		
	}

	public void viewAllCars() {
		for(int i =0;i<index;i++) {
			displayCarInfo(carsInfo[i]);
		}
	}

	public void viewCarsByCost(int costLimit) {
		
		for(int i =0;i<index;i++) {
			if(carsInfo[i].getCost()<=costLimit) {
				displayCarInfo(carsInfo[i]);
			}
		}
	}

	public void viewCarsByPower(int powerLimit) {
		for(int i =0;i<index;i++) {
			if(carsInfo[i].getEngine().getBasepower()<=powerLimit) {
				displayCarInfo(carsInfo[i]);
			}
		}
	}

	public void insertCarByUser() {
		System.out.println(" Enter Car Name ");
		String carName = sc.nextLine();
	
		System.out.println(" Enter Car Cost ");
		int cost = Integer.parseInt(sc.nextLine());
		
		System.out.println(" Enter Engine Power ");
		int enginePower = Integer.parseInt(sc.nextLine());
		
		Engine e = new Engine(enginePower);
		Car obj = new Car(e);
		obj.setCarName(carName);
		obj.setCost(cost);
				
		addCar(obj);
		
	}
	
	public boolean addCar(Car car) {
		boolean isInserted = true;
		
		carsInfo[index] = car;   // SQL Insert Query insert into Car values(....);
		index++;
		return isInserted;
	}
	
	
	public void displayCarInfo(Car car) {
		System.out.println(" ----- Car Information ----");
		System.out.println(" Car Name "+car.getCarName());
		System.out.println(" Car Cost "+car.getCost());
		System.out.println(" Car Engine "+car.getEngine().getBasepower());
	}
	
}//end class
