package Lab6;

import java.util.*;
import java.util.Map.Entry;

public class CharacterCount {
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the character : ");
	    String str = sc.nextLine();
	    Map<Character, Integer> cc = countChars(str);
	    for (Entry<Character, Integer> entry : cc.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}
	
	public static Map<Character, Integer> countChars(String inputString){
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
  
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
		return charCountMap;
        
    }
}