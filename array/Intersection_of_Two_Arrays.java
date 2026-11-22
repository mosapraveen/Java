package array;

import java.util.Scanner;

public class Intersection_of_Two_Arrays {

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


        for (int i = 0; i < arr.length; i++) {

            boolean found = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    found = true;
                    break;
                }
            }

            if (found) {
            	
                continue;
            }
            for (int j = 0; j < arr1.length; j++) {

                if (arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}

