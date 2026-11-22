package array;

import java.util.Scanner;

public class Pair_Sum_Closest_to_Target {

	@SuppressWarnings("resource")
	public static void main(String[] args){
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
		System.out.print("Enter the Target Sum: ");
		int t = sc.nextInt();
		int start = 0,end = 1 ,diff=Integer.MAX_VALUE;
		int sum=0;
		int psum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				sum=arr[i]+arr[j];
				if(Math.abs(sum-t) < diff) {
					diff=Math.abs(t-sum);
					start=i;end=j;
					psum=sum;
				}
			}
		}
		System.out.println("Indices are : " + start + " " + end + "\nPairs are: " + arr[start] + " " + arr[end] + "\nDiffrence is : " + diff + "\nPair sum is: " + psum);
		sc.close();
	}

}
