package basic_Arrays;

import java.util.Scanner;

public class maximum_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		IO.print("Enter Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int diff=0;
		for(int i=0;i<arr.length ; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j] > arr[i]) {
					if(diff < arr[j]-arr[i]) {
						diff = arr[j]-arr[i];
					}
				}
			}	
		}
		System.out.println("maximum difference : " + diff);
		sc.close();
	}

}
