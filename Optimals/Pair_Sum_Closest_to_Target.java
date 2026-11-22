package Optimals;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_Sum_Closest_to_Target {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		if(n<2) {
			throw new IndexOutOfBoundsException("The Array size must be greater than or equal to 2");
		}
		int [] arr = new int [n];
		System.out.print("Enter Array Elements : " );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter Target Element: ");
		int t = sc.nextInt();
		int start=0,end=arr.length-1;
		int sum=0;
		int s=0,e=0;
		int diff=Integer.MAX_VALUE;
		while(start<end) {
			sum=arr[start]+arr[end];
			if(Math.abs(sum-t)<diff) {
				diff=Math.abs(sum-t);
				s=start;
				e=end;
			}
			if(sum<t) {
				start++;
			}
			else {
				end--;
			}
		}
		System.out.println("Pairs are : " + arr[s] + " " + arr[e] + "\nindexes are: " + s + " " + e);
		System.out.println("Sum of pairs is: " + (arr[s] + arr[e]));
		sc.close();
	}

}
