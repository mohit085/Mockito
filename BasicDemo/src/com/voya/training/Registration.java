package com.voya.training;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] usernames = {"mohit","sahil","ram","mohan"};
		boolean ispresent = false;
		String newusername = sc.next();
		sc.close();
		for(String name : usernames) {
			if(name.equalsIgnoreCase(newusername)) {
				System.out.println("Name is not unique");
				ispresent = true;
				break;
			}
		}
		if(!ispresent) {
			System.out.println("You are registered");
		}
	}

}
