package basic_Arrays;

import java.util.Scanner;

public class Duplicates_Remove_in_Sorted_Array {

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
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		for(int m =0;m<=i;m++) {
			IO.print(arr[m] + " ");
		}
		sc.close();
	}

}
