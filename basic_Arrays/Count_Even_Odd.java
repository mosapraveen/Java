package basic_Arrays;

import java.util.Scanner;

public class Count_Even_Odd {

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
		int ecount=0,ocount=0;
		for(int i : arr ) {
			if(i%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
		}
		IO.println("Even Numbers Count : " + ecount +"\nOdd numbers Count: " + ocount);
		sc.close();

	}

}
