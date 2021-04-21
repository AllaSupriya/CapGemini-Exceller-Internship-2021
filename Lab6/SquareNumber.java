package Lab6;

import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
        System.out.println("Enter number of elements in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
	    Map<Integer, Integer> map = getSquares(a);
	 
	    Iterator<Integer> it = map.keySet().iterator();
	    
	    while(it.hasNext()){
	    Integer key = it.next();
	      System.out.println(key + " : " + map.get(key));
	    }
	}
	public static Map<Integer, Integer> getSquares(int[] a) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    for (int n: a) {
	      map.put(n, n*n);
	    }
	    return map;
	}
}
