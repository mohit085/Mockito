package com.voya.training;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[]  array1 = new int[size];
		int[] array2 = new int[size];
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i]*array1[i];
		}
		for(int print : array2) {
			System.out.println(print);
		}
		sc.close();
	}

}
