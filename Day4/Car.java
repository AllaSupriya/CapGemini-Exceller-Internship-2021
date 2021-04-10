package Day4;

////Entity  ( this class becomes table in database)
/// Java bean class 
///  POJO (Plain old java object)
public class Car {
	//  2000 property
	private int cost;
	private String carName;
	private Engine engine;
	private int carPower;
	private boolean music;

	//----
	private Music ms;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public Car(Music ms) {
		this.ms = ms;
	}

	public Music getMs() {
		return ms;
	}

	public void setMs(Music ms) {
		this.ms = ms;
	}

	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}




	public String getCarName() {
		return carName;
	}




	public void setCarName(String carName) {
		this.carName = carName;
	}




	public Engine getEngine() {
		return engine;
	}




	public void setEngine(Engine engine) {
		this.engine = engine;
	}




	public int getCarPower() {
		return carPower;
	}




	public void setCarPower(int carPower) {
		this.carPower = carPower;
	}




	public void doStartCar()
	{
		// ------
		carPower = engine.doStartEngine("petrol") + 100;

	}



	public void moveCarForward()
	{
		doStartCar();
		if(carPower>1000) System.out.println(" Car speed is High ");
		if(carPower<1000) System.out.println(" Car speed is low ");
		if(carPower<5000) System.out.println(" This must be a truck ");


	}

	public void playMusic(double d)
	{
		music = ms.doStartMusicByRadio(d);
		if(music) {
			System.out.println(" Music is playing ");
		}else {
			System.out.println(" Radio Station not found ");
		}
	}

}

