package Day3;
/*
 * Create class Car
provide default and arg constructor
create 3 different objects

call business method (startCar())
 */
class DemoCar{
	private int year;
	private String modelName;
	private int distanceTravelled;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	DemoCar(){
		System.out.println("Default constructor Democar");
		year = 2015;
		modelName = "Creta";
		distanceTravelled = 12345;
	}
	
	DemoCar(int year,String modelName){
		this.year = year;
		this.modelName = modelName;
		System.out.println(year+" and "+modelName);
	}
	
	public void startCar() {
		System.out.println(modelName+" started");
	}
}

public class Car {

	public static void main(String[] args) {	
		DemoCar dc1 = new DemoCar();
		dc1.startCar();
		
		DemoCar dc2 = new DemoCar(2018,"Kia");
		dc2.startCar();
	}

}
