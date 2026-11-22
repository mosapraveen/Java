package basic_Arrays;

import java.util.Scanner;

public class Small_Element {

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
		int small = arr[0];
		for(int i : arr) {
			if(i < small) {
				small = i;
			}
		}
		System.out.println("Small element is : " + small);
		sc.close();

	}

}
