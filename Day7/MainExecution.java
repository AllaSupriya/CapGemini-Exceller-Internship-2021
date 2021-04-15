package Day7;

public class MainExecution {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		
		try {	
			
			String codes[] = service.getEmployeeCodes();
			
			String city[] = service.getEmployeeCity();
			
			/*for(int i=0;i<codes.length;i++) {
				if(city[i].equals("011")) {
					System.out.println(codes[i]+" Delhi");
				}
				else if(city[i].equals("022")) {
					System.out.println(codes[i]+" Mumbai");
				}
				else if(city[i].equals("080")) {
					System.out.println(codes[i]+" Banglore");
				}
				else if(city[i].equals("020")) {
					System.out.println(codes[i]+" Pune");
				}
				else {
					throw new EmpCodeException(city[i]);
				}
			}*/
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		/*for example 
		 *       011 : Delhi 
		 *       022 : Mumbai 
		 *       080 : Banglore
		 *       020 : Pune*/
		
	}//end main

}//end class
 
 