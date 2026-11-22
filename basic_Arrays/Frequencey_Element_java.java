package basic_Arrays;

import java.util.Scanner;

public class Frequencey_Element_java {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + (i+1) + " element: ");
			arr[i]=sc.nextInt();
		}
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			IO.println("count of " + arr[i] + " is: " + count);
		}
		sc.close();
	}
}
