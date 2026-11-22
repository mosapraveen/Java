package array;

import java.util.Scanner;

public class Target_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();sc.nextLine();
		if (n == 0) {
		    return;
		}
		int [] arr = new int [n];
		IO.print("Enter Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter target sum: ");
		boolean [] visit = new boolean[n];
		int k = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(visit[i]) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(visit[j]) {
					continue;
				}
				if(arr[i]+arr[j]==k) {
					visit[i]=true;
					visit[j]=true;
					System.out.println(arr[i] + " " + arr[j]);
					break;
				}
			}
		}

	}

}
