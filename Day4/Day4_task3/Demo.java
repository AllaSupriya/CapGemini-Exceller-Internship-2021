package Day4_task3;

public class Demo {
	
	static Car cars[] = new Car[5];
	int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setCarName("Grand i10");
		c.setCarModel(2019);
		c.setCarCost(8_00_000);
		
		Car c1 = new Car();
		c1.setCarName("i20");
		c1.setCarModel(2016);
		c1.setCarCost(9_00_000);
		
		new Demo().insertCar(c);
		
		new Demo().insertCar(c1);
	}

	private void insertCar(Car c) {
		// TODO Auto-generated method stub
		cars[count] = c;
		System.out.println(cars[count].getCarName());
		count++;
	}

}
