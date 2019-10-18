package com.exercise14Ternarianoperator.app;

import java.util.Scanner;

public class Ternarian {

	public static void main(String[] args) {
		int num1=0;
		String message = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		num1 = input.nextInt();
		message = num1>5?"greater": "lower";
		System.out.println(message);

	}

}
