package Day3;

class DemoClass{
	int x;
	String name;
	
	DemoClass(){
		System.out.println("inside default constructor");
		x=10;
		name = "no name";
	}
	
	void DemoClass(int x) {}
	
	DemoClass(String name){}
	
	DemoClass(int x,String name){}
	
	public void doThing() {
		System.out.println("In doThing "+x+" "+name);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass obj = new DemoClass();
		obj.doThing();

	}

}
