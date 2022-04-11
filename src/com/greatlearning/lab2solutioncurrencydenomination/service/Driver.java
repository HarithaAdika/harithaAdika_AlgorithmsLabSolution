package com.greatlearning.lab2solutioncurrencydenomination.service;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int arrSize = sc.nextInt();
		int currencydenom[] = new int[arrSize];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < arrSize; i++) {
			currencydenom[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		CalculateMinimumNotes payment = new CalculateMinimumNotes();
		payment.minimumNotes(currencydenom, amount);
		sc.close();
	}

}
