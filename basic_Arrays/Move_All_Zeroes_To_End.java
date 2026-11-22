package basic_Arrays;

import java.util.Scanner;

public class Move_All_Zeroes_To_End {

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
		
		int left=0;
		for(int right=0;right<arr.length;right++) {
			if(arr[right] != 0 ) {
				int temp = arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
				
				left++;
			}
		}
		
		for(int i : arr) {
			IO.print(i + " ");
		}
		
		sc.close();
	}

}
