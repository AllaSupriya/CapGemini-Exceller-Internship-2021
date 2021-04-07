package Day2_Arrays;
import java.util.*;

public class BasicOperations {
	
	int arr[] = new int[3000];
	int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BasicOperations obj = new BasicOperations();
		while(true) {
			System.out.print("-----------------------------------------------------");
			System.out.println("\nEnter a number:\n1.Insert\n2.Search\n3.Display\n4.Delete\n5.Search by Index\n6.Print all even data\n0.Exit");
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("Enter data to insert:");
				int data = sc.nextInt();
				obj.insertData(data);
			}else if(n==2) {
				System.out.println("Enter data to be Searched: ");
				int data = sc.nextInt();
				int pos = obj.searchData(data);
				if(pos!=-1){
					System.out.println(data+" is at position "+(pos+1));
				}else{
					System.out.println(data+" Not available in the list. ");
				}				
			} else if(n==3) {
				System.out.println("The data in array is:");
				obj.displayData(obj.arr,obj.index);
			} else if(n==4) {
				System.out.println("Enter data to be deleted: ");
				obj.deleteData(sc.nextInt());
			} else if(n==5){
				System.out.println("Enter index to be Searched: ");
				obj.searchIndex(sc.nextInt());
			} else if(n==6) {
				System.out.println("The Even data in array: ");
				obj.printEven(obj.arr);
			} else if(n==0) {
				System.out.println("Thankyou!");
				System.exit(0);
			} else {
				System.out.println("Enter numbers between 0 to 6");
			}
		}
	}

	public void searchIndex(int n) {
		// TODO Auto-generated method stub
		if(n<0 || n>index) {
			System.out.println("Index out of bound");
		}else {
			System.out.println("Data at given index is: "+arr[n-1]);
		}
		
	}

	public void printEven(int arr[]) {
		// TODO Auto-generated method stub
		int b[] = new int[index];
		int j=0;
		for(int i=0;i<index;i++) {
			if(arr[i]%2 == 0) {
				b[j++] = arr[i];
			}
		}
		System.out.println("Even data in array: ");
		displayData(b,j);
	}

	public void deleteData(int data) {
		// TODO Auto-generated method stub
		int pos = searchData(data)+1;
		if(pos == -1)  {
	        System.out.println("Data is not there in array");
	    }else {
	        for(int i=pos-1; i<index-1; i++) {
	            arr[i] = arr[i + 1];
	        }
	        System.out.println("Data deleted Successfully");
	    }
		index--;
	}

	public void displayData(int arr[],int n) {
		// TODO Auto-generated method stub
		for(int i = 0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

	public int searchData(int data) {
		// TODO Auto-generated method stub
		for(int i = 0;i<index;i++){
			// --- compare my searchData with data arr[index]
			if(arr[i] == data) {
				return i;
			}
		}
		// if we dont get data
		return -1;
		
	}

	public void insertData(int data) {
		// TODO Auto-generated method stub
		arr[index++] = data;
		
	}

}
