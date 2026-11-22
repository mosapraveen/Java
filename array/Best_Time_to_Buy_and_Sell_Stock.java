package array;

import java.util.Scanner;

public class Best_Time_to_Buy_and_Sell_Stock {

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
		
		int buy=arr[0];
		int profit=0;
		int temp=0,stemp=0;
		for(int i=1;i<arr.length;i++) {
			if(buy<arr[i]) {
				if(profit<arr[i]-buy) {
					profit=arr[i]-buy;
					stemp=i;
				}
			}
			
			if(buy>arr[i]) {
				buy=arr[i];
				temp=i;
			}
		}
		System.out.println("Profit : " + profit);
		System.out.println("buy: " + temp + "\6nsell: " + stemp);
		sc.close();
	}
}
