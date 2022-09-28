package com.test;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        //write your code here
	        int n;
	        int i;
	        System.out.print("Enter the number of elements you want to store: ");
	        Scanner sc = new Scanner(System.in);
	        n=sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter array elements:");
	        for (i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("odd array elements are :");
	        for (i = 0; i < n; i++) {
	            if (arr[i]%2 != 0) {
	                System.out.println(arr[i]);
	            } else
	                continue;

	        }
	        sc.close();
	    }

}
