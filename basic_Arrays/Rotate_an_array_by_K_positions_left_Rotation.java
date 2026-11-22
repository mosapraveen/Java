package basic_Arrays;

import java.util.Scanner;

public class Rotate_an_array_by_K_positions_left_Rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		if (n == 0) {
		    return;
		}
		int [] arr = new int [n];
		IO.print("Enter Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the k value: ");
		int k = sc.nextInt();
		if (k<0) {
		    System.out.println("K value must be greaterthan zero");
		    return;
		}

		k = k % arr.length;
		
		rotate(arr,0,k-1);
		rotate(arr,k,arr.length-1);
		rotate(arr,0,arr.length-1);
		
		
		
		for(int m : arr) {
			System.out.print(m + " ");
		}
		
		sc.close();

	}
	public static void rotate(int [] arr , int left , int right) {
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}

}

