package com.test;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
        //Que1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int b = sc.nextInt();
        if (l == b) {
            System.out.println("It's a Square.");
        } else {
            System.out.println("It's a Rectangle.");
        }
        sc.close();
	}

}
