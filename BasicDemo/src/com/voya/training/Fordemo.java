package com.voya.training;
import java.util.Scanner;

public class Fordemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+number+"="+(i*number));
		}
		
		while(number<10) {
			System.out.println(number);
			number++;
		}
		System.out.println();

//	
	// now the value of x is 10;
	do {
		System.out.println(number);
		number--;
	} while(number>0);
}
}
