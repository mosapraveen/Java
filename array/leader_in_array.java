package array;

import java.util.Scanner;

public class leader_in_array {

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
		
//		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			boolean found=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					found=false;
					break;
				}
			}
			if(found) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
