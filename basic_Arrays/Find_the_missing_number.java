package basic_Arrays;

import java.util.Scanner;

public class Find_the_missing_number {

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
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int sum2 = ((n+1)*(n+2)/2);
		IO.println("Missing Number: " + (sum2-sum));
		sc.close();
	}

}
