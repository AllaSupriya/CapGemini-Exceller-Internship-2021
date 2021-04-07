package Day2_Lab2;
import java.util.*;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		String a[] = new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		String b[] = new String[n];
		StringSort ss = new StringSort();
		b = ss.sortString(a,n);
		for(int i = 0;i < n;i++) {
        	System.out.print(b[i]+" ");
        }
	}
	
	private String[] sortString(String[] a, int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i].compareTo(a[j])>0) {
					String t = a[i];
					a[i]=a[j];
					a[j] = t;
				}
			}
		}for(int i=0;i<n;i++) {
			if(a[i].length()%2==0) {
				a[i] = a[i].substring(0,a[i].length()/2).toUpperCase() + a[i].substring(a[i].length()/2,a[i].length()).toLowerCase();
			}else {
				a[i] = a[i].substring(0,((int)a[i].length()/2)+1).toUpperCase() + a[i].substring(((int)a[i].length()/2)+1,a[i].length()).toLowerCase();
			}
		}		
		return a;
	}

}
