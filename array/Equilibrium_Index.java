//1. What is an Equilibrium Index?
//An index is called an Equilibrium Index if:
//The sum of all elements on its left side is equal to the sum of all elements on its right side.
//
//Important:
//- Don't include the current element in either sum.
//- We compare the left-side sum and right-side sum.
//- The index starts from 0 in Java.


package array;

import java.util.Scanner;

public class Equilibrium_Index {

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
		
		if(arr.length==1) {
			System.out.println("Equilibrium Index: " + 0);
		}
		else if(arr.length<1) {
			System.out.println("Ypu must Enter Array Elements");
		}
		else{
			boolean found=false;
			System.out.print("Equilibrium Index : " );
			for(int i=0;i<arr.length;i++) {
				
				int sum1=0;
				for(int k=i-1;k>=0;k--) {
					sum1+=arr[k];
				}
	//			System.out.print(sum1 + " ");
				
				int sum=0;
				for(int j=i+1;j<arr.length;j++) {
					if(i==arr.length-1) {
						continue;
					}
					else {
						sum+=arr[j];
					}
				}
	//			System.out.print(sum + " ");
				if(sum1==sum) {
					System.out.print(i + " ");
					found=true;
				}
			}
			if(!found) {
				System.out.print("Not Found");
			}
		}
		sc.close();
		
	}

}
