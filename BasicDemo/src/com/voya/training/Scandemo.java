package com.voya.training;
import java.util.Scanner;

public class Scandemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.nextLine();
	System.err.println(name);
	System.out.println("Enter your ID");
	int id = sc.nextInt();
	System.out.println(id);
	System.out.println("Enter your city");
	String city = sc.nextLine();
	System.out.println(city);
	System.out.println("Enter your salary");
	Double salary = sc.nextDouble();
	System.out.println(salary);
	sc.close();
	}

}
