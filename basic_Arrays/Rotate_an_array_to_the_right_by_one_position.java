package basic_Arrays;

import java.util.Scanner;

public class Rotate_an_array_to_the_right_by_one_position {

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
		if(arr.length>0){
			int end = arr[arr.length-1];
	
			for(int i = arr.length - 1; i > 0; i--) {
			    arr[i] = arr[i - 1];
			}
	
			arr[0] = end;
		}
		else {
			System.out.print("Array length must be greater than 0");
		}
		for(int i : arr) {
			IO.print(i + " ");
		}
		sc.close();
	}

}
