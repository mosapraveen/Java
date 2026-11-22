package basic_Arrays;

import java.util.Scanner;

public class Largest_Element {

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
		int max = arr[0];
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("Max element is : " + max);
		sc.close();

	}

}
