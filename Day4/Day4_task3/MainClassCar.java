package Day4_task3;

public class MainClassCar {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setCarName("creata");
		c.setCarModel(2018);
		c.setCarCost(10_00_000);
		
		Car c2 = new Car();
		c2.setCarName("kia");
		c2.setCarModel(2020);
		c2.setCarCost(15_00_000);
		
		CreateCar cc = new CreateCar();
		cc.insertCar(c);
		cc.insertCar(c2);
		
		Car c1 = new Car();
		c1 = cc.searchCar(0);
		
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarModel());
		System.out.println(c1.getCarCost());

	}
}
