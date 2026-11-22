package basic_Arrays;

import java.util.Scanner;

public class Duplicate_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		if (n == 0) {
		    return;
		}
		int [] arr = new int [n];
		IO.print("Enter Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(arr.length<=1) {
			return;
		}
		boolean [] visit = new boolean[n];
		System.out.print("Duplicate elements are: ");
		boolean dup=false;
		for(int i=0;i<arr.length;i++) {
			if(visit[i]) {
				continue;
			}
			
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visit[j]=true;
				}
			}
			if(count>1) {
				System.out.print(arr[i]);
				dup=true;
			}
		}
		if(!dup) {
			System.out.println("None");
		}
		sc.close();
	}

}
