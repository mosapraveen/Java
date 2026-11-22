package basic_Arrays;

import java.util.Scanner;

public class Secound_Smallest {

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
		Integer first = null , second = null;
		for(int i : arr) {
			if(first == null || i < first) {
				second = first;
				first = i;
			}
			else if ((second == null || i< second) && i != first) {
				second = i;
			}
		}
		if (second == null)
		    System.out.println("No second smallest element");
		else
		    System.out.println("Second smallest = " + second);
		sc.close();
		
	}

}
