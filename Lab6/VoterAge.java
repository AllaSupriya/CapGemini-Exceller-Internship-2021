package Lab6;

import java.util.*;

public class VoterAge {
	public static void main(String[] ar)
    {
           HashMap<String,Integer> per = new HashMap<>();
           VoterAge pa = new VoterAge();
           per.put("abc",20);
           per.put("def",17);
           per.put("ghu",25);
           per.put("ijk",14);
           per.put("lmn",22);
           System.out.println(pa.votersList(per));
    }
	public List<String> votersList(HashMap<String,Integer> per)
    {
           List<String> age = new ArrayList<>();
           Set<String> set = per.keySet();
           for(String s:set)
           {
                  Integer age1 = per.get(s);
                  if(age1 > 18)
                  {
                        age.add(s);
                  }
           }
           return age;
    }
}
