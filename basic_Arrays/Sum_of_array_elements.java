package basic_Arrays;

import java.util.Scanner;

public class Sum_of_array_elements {

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
		int sum=0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
