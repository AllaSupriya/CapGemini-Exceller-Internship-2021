package Day3;

public class Dog {
	
	private String name;
	private int age;
	private int weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//current calling object
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//can add business operation and 
		// non functional requirements before setting age
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//business method
	public void dofeedAnimal() {
		this.weight+=10;
		System.out.println(this.name+"current weight is "+this.weight+"kg");
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getWeight()=" + getWeight() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void playGames() {
		if(weight < 2) {
			System.out.println(name +" can't play game because its is "+weight+"kg");
		}else {
			weight--;
			System.out.println(name +" is playing ");
		}
	}
}
