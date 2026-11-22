package Optimals;

import java.util.Scanner;

public class Maximum_Subarray_Sum_Kadens_Algoritham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.print("Enter Array Elements : " );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int current_sum=0,max_sum=Integer.MIN_VALUE;
		int start=0,end=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			current_sum = current_sum + arr[i];
//			end=i;
			if(current_sum > max_sum) {
				max_sum = current_sum;
				start=temp;
				end=i;
			}
			
			if(current_sum < 0) {
				current_sum = 0;
				temp=i+1;
			}
		}
		System.out.println("Maximum Subarray Sum is : " + max_sum + "\nStarts : " + start + "\nEnds : " + end);
		System.out.print("Sub Array is : {" );
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("}");
		
		sc.close();
	}

}
