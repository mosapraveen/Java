package array;

import java.util.Scanner;

public class Maximum_Subarray_Sum {

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
		int max_sum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int max=arr[i];
			if(max_sum < max) {
                max_sum = max;
            }
			for(int j=i+1;j<arr.length;j++) {
				max+=arr[j];
				if(max_sum<max) {
					max_sum=max;
				}
			}
		}
		System.out.println(max_sum);
		sc.close();
	}

}
