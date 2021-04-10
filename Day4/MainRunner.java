package Day4;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B				
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		
		Music m = new Music(98.3);		
		Car c1 = new Car(m);		
		c1.playMusic(m.getPlayMusic());
		
		Music m1 = new Music(91.1);		
		Car c2 = new Car(m1);
		c2.playMusic(m1.getPlayMusic());
		
		
		
	}
}
