package basic_Arrays;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter " + i + " element : ");
			arr[i]=sc.nextInt();
		}
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		IO.println(arr.toString());
		for(int i : arr){
		      IO.print(i + " ");
		}
		sc.close();

	}

}
