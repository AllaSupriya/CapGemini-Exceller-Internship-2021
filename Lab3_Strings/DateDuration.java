package Lab3_Strings;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class DateDuration {
       public static void main(String[] args) {
    	   System.out.println("Enter date in format yyyy mm dd");
    	   Scanner sc=new Scanner(System.in);
           LocalDate givendate = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
           LocalDate currentdate = LocalDate.now();
           Period diff = Period.between(givendate, currentdate);
           System.out.printf(diff.getYears()+"years "+diff.getMonths()+"months "+diff.getDays()+"days");
	}
}