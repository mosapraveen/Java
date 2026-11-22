//sorted array

package array;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sum_paired_inixes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.print("Enter Array Elements : " );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the Target sum : ");
		int target = sc.nextInt();
		
		int left=0,right=arr.length-1;
		boolean found=false;
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println("Indices are : " + left + " " + right);
				System.out.println("Elements are : " + arr[left] + " " + arr[right]);
				found=true;
				break;
			}
			if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		if(!found) {
			System.out.println("indcies not foun");
		}
		
		sc.close();
	}
}
