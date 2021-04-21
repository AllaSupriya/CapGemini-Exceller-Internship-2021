package Lab6;

import java.util.HashMap;
import java.util.Set;

public class StudentMedals {
	
    public static void main(String[] ar) {
           HashMap<String,Integer> s = new HashMap<>();
           StudentMedals sm = new StudentMedals();
           s.put("a",65);
           s.put("b",76);
           s.put("c",89);
           s.put("d",90);
           s.put("e",93);
           System.out.println(sm.getStudents(s));
    }
    
    public HashMap<String, String> getStudents(HashMap<String,Integer> s)    {
        HashMap<String,String> medal = new HashMap<>();
        Set<String> set = s.keySet();
        for(String st:set) {
               Integer marks = s.get(st);
               if(marks>=90)
               {
                     medal.put(st,"Gold");
               }
               else if(marks >=80)
               {
                     medal.put(st,"Silver");
               }
               else if(marks>=70)
               {
                     medal.put(st,"Bronze");
               }
               else {
            	   medal.put(st, "No Medal");
               }
        }
        return medal;
 }
}
