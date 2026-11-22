package array;

import java.util.Scanner;

public class Union_of_Two_Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Array size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] union = new int[n + n1];
        
        int k=0;
        
        for(int i=0;i<arr.length;i++) {
        	boolean find=false;
        	for(int j=0;j<k;j++) {
        		if(union[j]==arr[i]) {
        			find=true;
        			break;
        		}
        	}
        	if(!find) {
        		union[k]=arr[i];
        		k++;
        	}
        }
        
        for(int i=0;i<arr1.length;i++) {
        	boolean find=false;
        	for(int j=0;j<k;j++) {
        		if(union[j]==arr1[i]) {
        			find=true;
        			break;
        		}
        	}
        	if(!find) {
        		union[k]=arr1[i];
        		k++;
        	}
        }
        
        for(int i=0;i<k;i++) {
        	System.out.print(union[i] + " ");
        }
        
        
	}
	
	

}
