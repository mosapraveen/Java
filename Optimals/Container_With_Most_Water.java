package Optimals;

import java.util.Scanner;

public class Container_With_Most_Water {

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
		int area=Integer.MIN_VALUE;
		
		int left=0,right=arr.length-1;
		int height=0,width=0;
		while(left<right) {
			width=right-left;
			if(arr[left]<arr[right]) {
				height=arr[left];
				left++;
			}
			else {
				height=arr[right];
				right--;
			}
			if(area < height*width) {
				area=height*width;
			}
		}
		System.out.println("Max area is : " + area);
		sc.close();
	}

}
