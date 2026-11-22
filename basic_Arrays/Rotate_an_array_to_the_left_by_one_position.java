package basic_Arrays;

import java.util.Scanner;

public class Rotate_an_array_to_the_left_by_one_position {

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
		int start = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=start;
		for(int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();

	}

}
