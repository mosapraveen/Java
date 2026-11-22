package array;

import java.util.Scanner;

public class Three_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.print("Enter Array Elements : " );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Target Sum: ");
		int target = sc.nextInt();
		boolean found=false;
		for(int i = 0; i < arr.length; i++) {
		    for(int j = i + 1; j < arr.length; j++) {
		        for(int k = j + 1; k < arr.length; k++) {
		        	if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]) {
		        		if(arr[i] + arr[j] + arr[k] == target) {
		        			System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
		        			found=true;
		        		}
		        	}
		        }
		    }
		}
		if(!found) {
			System.out.println("Not Found");
		}
		
		sc.close();
	}

}
