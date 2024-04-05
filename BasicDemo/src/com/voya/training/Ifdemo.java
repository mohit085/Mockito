package com.voya.training;
import java.util.Scanner;

public class Ifdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  name = sc.next();
		sc.close();
		if(name.compareTo("mohit")==0) {
			System.out.println("Welcome mohit");
		} else {
			System.out.println("Get out"+" "+name);
		}

	}

}
