package array;

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
		for(int i=0;i<arr.length;i++) {
			int height=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				int width = j-i;
				if(arr[i] > arr[j]) {
					height=arr[j];
				}
				else {
					height=arr[i];
				}
				if(area<height*width) {
					area=height*width;
				}
			}
		}
		System.out.println(area);
		
		
		sc.close();
	}

}
