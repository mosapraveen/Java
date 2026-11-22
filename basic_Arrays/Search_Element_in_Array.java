package basic_Arrays;

import java.util.Scanner;

public class Search_Element_in_Array {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter key element to found : ");
		int num = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				System.out.println("Key Found at : " + i);
				return ;
			}
		}
		System.out.println("Key Not Found");
		sc.close();
		
	}
}
