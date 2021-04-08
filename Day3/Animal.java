package Day3;
import java.util.*;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dog d1 = new Dog();
		
		System.out.println("Enter Name, Age and Weight of your Dog:");
		d1.setName(sc.next());
		d1.setAge(sc.nextInt());
		d1.setWeight(sc.nextInt());
		
		while(true) {
			System.out.println("\nEnter 1.To Feed 2.To Play 3.Stop");
			int n = sc.nextInt();
			if(n==1) {
				d1.dofeedAnimal();
			}else if(n==2) {
				d1.playGames();
			}else if(n==3) {
				System.out.println("Let's take rest...");
				System.exit(0);
			}else {
				System.out.println("Select numbers between 1,2,3");
			}
		}

	}

}
