package basic_Arrays;

import java.util.Scanner;

public class Second_Largest {

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
		Integer first = null , secound = null ;
		
		for(int i : arr) {
			if(first == null || i > first ) {
				secound = first;
				first = i;
			}
			else if( (secound == null || i > secound ) && i != first ) {
				secound = i;
			}
		}
		IO.println(secound);
		sc.close();

	}

}
