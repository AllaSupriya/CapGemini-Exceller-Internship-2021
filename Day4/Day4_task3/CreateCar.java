package Day4_task3;

public class CreateCar {
	
		private Car[] cars = new Car[5];
		private int c=0;
		
		public Car[] getCars() {
			return cars;
		}
		
		public void setCars(Car[] cars) {
			this.cars = cars;
		}
		
		public int getC() {
			return c;
		}

		public void setC(int c) {
			this.c = c;
		}
		
		public void insertCar(Car car) {
			cars[c]=new Car();
			cars[c].setCarName(car.getCarName());
			cars[c].setCarModel(car.getCarModel());
			cars[c].setCarCost(car.getCarCost());
			c++;
		}
		public Car searchCar(int id) {
			return cars[id];
		}
}
