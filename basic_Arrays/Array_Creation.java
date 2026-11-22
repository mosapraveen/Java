package basic_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
