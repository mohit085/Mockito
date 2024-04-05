package com.voya.training;

public class Ternary {

	public static void main(String[] args) {
		int a=54;int b=88;int c=22;
		String s = (a>b && a>c)?"a ids greater":b>c?"b  is greater":"c is greater";
		System.out.println(s);

	}

}
