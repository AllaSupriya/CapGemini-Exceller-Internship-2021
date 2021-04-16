package Day7_Lab5;

public class PersonValidate {

	public static void main(String[] args) {
		try (Person p = new Person(32,"abc xys",3000)){//try with resource
			//autoclosable is implemnted... so that it helps to close all resorces
			//instead of finally block
			
			// can also write files using printwriter p = new printwriter(new File="")
			System.out.println(p);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Execution done");
			//used to allocate resources
			//like to close database or commit
		}
	}

}
